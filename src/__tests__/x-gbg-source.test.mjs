/*
 * Tests for GbgSourceHook (GGO-16030 / issue #34). Not managed by Speakeasy.
 *
 * The SDK source uses `.js` import specifiers for `.ts` files, so tests run
 * against the built output rather than source. This lives in `src/__tests__`,
 * which tsconfig excludes from the build/publish.
 *
 *   npm run build
 *   node --test src/__tests__/x-gbg-source.test.mjs
 */

import assert from "node:assert/strict";
import { test } from "node:test";

import { SDK_METADATA } from "../../dist/esm/lib/config.js";
import {
  GbgSourceHook,
  X_GBG_SOURCE_HEADER,
} from "../../dist/esm/hooks/x-gbg-source.js";

const hook = new GbgSourceHook();

const ctx = (options = {}) => ({ options });
const input = (headers) => ({
  url: new URL("https://example.com/journey/start"),
  options: { headers },
});
const headerOf = (result) =>
  new Headers(result.options?.headers).get(X_GBG_SOURCE_HEADER);

test("defaults to the SDK user-agent when no source is configured", () => {
  assert.equal(headerOf(hook.beforeCreateRequest(ctx(), input())),
    SDK_METADATA.userAgent);
});

test("uses the client-creation `source` option when provided", () => {
  assert.equal(
    headerOf(hook.beforeCreateRequest(ctx({ source: "acme-portal" }), input())),
    "acme-portal",
  );
});

test("a per-request X-GBG-Source header wins over the client option", () => {
  const result = hook.beforeCreateRequest(
    ctx({ source: "acme-portal" }),
    input({ [X_GBG_SOURCE_HEADER]: "checkout-v3" }),
  );
  assert.equal(headerOf(result), "checkout-v3");
});

test("preserves other headers already on the request", () => {
  const result = hook.beforeCreateRequest(
    ctx(),
    input({ "Content-Type": "application/json" }),
  );
  const headers = new Headers(result.options?.headers);
  assert.equal(headers.get("Content-Type"), "application/json");
  assert.equal(headers.get(X_GBG_SOURCE_HEADER), SDK_METADATA.userAgent);
});
