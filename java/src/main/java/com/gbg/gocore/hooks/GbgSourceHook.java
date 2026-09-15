/*
 * Custom hook: stamps an `X-GBG-Source` usage-tracking header on every
 * outgoing request.
 *
 * This file is NOT managed by Speakeasy — it is not tracked in
 * `java/.speakeasy/gen.lock`, and it is registered from `SDKHooks.java`, which
 * Speakeasy generates only once. Both therefore survive the weekly forced SDK
 * regeneration. Do not move this logic into generated files
 * (`SDKConfiguration.java`, `utils/Hooks.java`, `build.gradle`): those are
 * overwritten on regen.
 *
 * This is the Java counterpart of `src/hooks/x-gbg-source.ts` in the TypeScript
 * SDK. Keep the two in step — see GGO-16030 / GitHub issue #34.
 */
package com.gbg.gocore.hooks;

import java.net.http.HttpRequest;
import java.util.Optional;

import com.gbg.gocore.SDKConfiguration;
import com.gbg.gocore.utils.Helpers;
import com.gbg.gocore.utils.Hook.BeforeRequest;
import com.gbg.gocore.utils.Hook.BeforeRequestContext;

/**
 * Sets the {@code X-GBG-Source} header on every request, identifying the
 * integration making the call.
 *
 * <h2>Precedence</h2>
 *
 * Highest first:
 *
 * <ol>
 *   <li>a per-request header — left untouched</li>
 *   <li>the value this hook was constructed with</li>
 *   <li>the {@code gbg.go.source} system property</li>
 *   <li>the {@code GO_SOURCE} environment variable</li>
 *   <li>the SDK user-agent string, which auto-tracks the SDK version</li>
 * </ol>
 *
 * <h2>Setting a source</h2>
 *
 * The TypeScript SDK takes this as a client-creation option
 * ({@code new Go({ source: "checkout-v3" })}). The Java SDK builder has no
 * extension point for custom options, so the equivalent is configured outside
 * the client — either at deployment:
 *
 * <pre>{@code
 * GO_SOURCE=checkout-v3
 * java -Dgbg.go.source=checkout-v3 -jar app.jar
 * }</pre>
 *
 * or, if you are vendoring the SDK, by registering the hook explicitly in
 * {@link SDKHooks}:
 *
 * <pre>{@code
 * hooks.registerBeforeRequest(new GbgSourceHook("checkout-v3"));
 * }</pre>
 *
 * Per-request, set the header directly on the request and this hook will leave
 * it alone.
 *
 * <p><b>Known parity gap:</b> because the source is resolved per JVM rather
 * than per client, two {@code Go} clients in the same process cannot report
 * different sources unless each is given its own explicitly-constructed hook.
 * The TypeScript SDK can. Revisit if Speakeasy adds custom client options to
 * the Java builder.
 */
public final class GbgSourceHook implements BeforeRequest {

    /** The usage-tracking header sent on every request. */
    public static final String X_GBG_SOURCE_HEADER = "X-GBG-Source";

    /** System property consulted when no explicit source is given. */
    public static final String SOURCE_PROPERTY = "gbg.go.source";

    /** Environment variable consulted when no explicit source is given. */
    public static final String SOURCE_ENV_VAR = "GO_SOURCE";

    private final Optional<String> source;

    /**
     * Resolves the source from the {@code gbg.go.source} system property, then
     * the {@code GO_SOURCE} environment variable, then the SDK user agent.
     */
    public GbgSourceHook() {
        this.source = Optional.empty();
    }

    /**
     * Always sends {@code source}, ignoring the system property and environment
     * variable.
     *
     * @param source value sent in the {@code X-GBG-Source} header; blank or
     *               null falls back to the resolution order above
     */
    public GbgSourceHook(String source) {
        this.source = normalise(source);
    }

    @Override
    public HttpRequest beforeRequest(BeforeRequestContext context, HttpRequest request)
            throws Exception {
        // Respect a per-request override if one was already set on the request.
        if (request.headers().firstValue(X_GBG_SOURCE_HEADER).isPresent()) {
            return request;
        }

        // HttpRequest is immutable, and HttpRequest.newBuilder(request, filter)
        // is Java 16+. This SDK targets Java 11, so copy via the generated
        // helper instead.
        return Helpers.copy(request)
                .header(X_GBG_SOURCE_HEADER, resolveSource())
                .build();
    }

    /**
     * The value this hook would send, absent a per-request override. Exposed so
     * callers can log or assert on it without issuing a request.
     *
     * @return the resolved source value
     */
    public String resolveSource() {
        return source
                .or(() -> systemProperty())
                .or(() -> environmentVariable())
                .orElse(SDKConfiguration.USER_AGENT);
    }

    private static Optional<String> systemProperty() {
        try {
            return normalise(System.getProperty(SOURCE_PROPERTY));
        } catch (SecurityException e) {
            // A restrictive SecurityManager must not break request sending.
            return Optional.empty();
        }
    }

    private static Optional<String> environmentVariable() {
        try {
            return normalise(System.getenv(SOURCE_ENV_VAR));
        } catch (SecurityException e) {
            return Optional.empty();
        }
    }

    private static Optional<String> normalise(String value) {
        return Optional.ofNullable(value)
                .map(String::trim)
                .filter(s -> !s.isEmpty());
    }
}
