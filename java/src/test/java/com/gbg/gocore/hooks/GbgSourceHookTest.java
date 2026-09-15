/*
 * Tests for the hand-written X-GBG-Source hook. Counterpart of the TypeScript
 * SDK's src/__tests__/x-gbg-source.test.mjs — keep the two in step.
 *
 * Not managed by Speakeasy: neither this file nor the test wiring in
 * build-extras.gradle is tracked in .speakeasy/gen.lock, so both survive
 * regeneration. See GGO-16030 / issue #34.
 */
package com.gbg.gocore.hooks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.http.HttpRequest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gbg.gocore.SDKConfiguration;

class GbgSourceHookTest {

    private static final String HEADER = GbgSourceHook.X_GBG_SOURCE_HEADER;

    private static HttpRequest request() {
        return HttpRequest.newBuilder()
                .uri(URI.create("https://eu.platform.go.gbgplc.com/v2/captain/journey/health"))
                .GET()
                .build();
    }

    private static String sourceHeaderOf(HttpRequest r) {
        return r.headers().firstValue(HEADER).orElse(null);
    }

    @Test
    @DisplayName("defaults to the SDK user agent, so the header tracks the SDK version")
    void defaultsToUserAgent() throws Exception {
        HttpRequest result = new GbgSourceHook().beforeRequest(null, request());

        assertEquals(SDKConfiguration.USER_AGENT, sourceHeaderOf(result));
    }

    @Test
    @DisplayName("a configured source wins over the user agent")
    void configuredSourceWins() throws Exception {
        HttpRequest result = new GbgSourceHook("acme-portal").beforeRequest(null, request());

        assertEquals("acme-portal", sourceHeaderOf(result));
    }

    @Test
    @DisplayName("a per-request header is left untouched")
    void perRequestHeaderWins() throws Exception {
        HttpRequest withHeader = HttpRequest.newBuilder(request().uri())
                .GET()
                .header(HEADER, "caller-supplied")
                .build();

        HttpRequest result = new GbgSourceHook("acme-portal").beforeRequest(null, withHeader);

        assertEquals("caller-supplied", sourceHeaderOf(result));
    }

    @Test
    @DisplayName("an empty configured source falls back to the user agent")
    void emptySourceFallsBack() throws Exception {
        HttpRequest result = new GbgSourceHook("").beforeRequest(null, request());

        assertEquals(SDKConfiguration.USER_AGENT, sourceHeaderOf(result));
    }

    @Test
    @DisplayName("the rest of the request survives being copied")
    void preservesRequest() throws Exception {
        HttpRequest original = request();
        HttpRequest result = new GbgSourceHook().beforeRequest(null, original);

        assertEquals(original.uri(), result.uri());
        assertEquals(original.method(), result.method());
        assertTrue(result.headers().firstValue(HEADER).isPresent());
    }
}
