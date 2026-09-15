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
 * Sets the {@code X-GBG-Source} header on every request. Precedence, highest
 * first:
 *
 * <ol>
 *   <li>a per-request header (set via request options) — left untouched</li>
 *   <li>the {@code source} value this hook was constructed with</li>
 *   <li>the SDK user-agent string (auto-tracks the SDK version)</li>
 * </ol>
 *
 * <p>To identify your integration, register the hook with an explicit source in
 * {@link SDKHooks}:
 *
 * <pre>{@code
 * hooks.registerBeforeRequest(new GbgSourceHook("acme-portal"));
 * }</pre>
 */
public final class GbgSourceHook implements BeforeRequest {

    /** The usage-tracking header sent on every request. */
    public static final String X_GBG_SOURCE_HEADER = "X-GBG-Source";

    private final Optional<String> source;

    /** Sends the SDK user-agent string as the source. */
    public GbgSourceHook() {
        this.source = Optional.empty();
    }

    /**
     * Sends {@code source} as the header value, identifying the integration
     * making the call.
     *
     * @param source value sent in the {@code X-GBG-Source} header
     */
    public GbgSourceHook(String source) {
        this.source = Optional.ofNullable(source).filter(s -> !s.isEmpty());
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
                .header(X_GBG_SOURCE_HEADER, source.orElse(SDKConfiguration.USER_AGENT))
                .build();
    }
}
