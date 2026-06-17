/*
 * Custom hook: stamps an `X-GBG-Source` usage-tracking header on every
 * outgoing request.
 *
 * This file is NOT managed by Speakeasy — it is not tracked in
 * `.speakeasy/gen.lock`, and it is imported from `registration.ts` which
 * Speakeasy generates only once. Both therefore survive the weekly forced SDK
 * regeneration. Do not move this logic into generated files (`config.ts`,
 * `sdks.ts`, `index.ts`, `package.json`): those are overwritten on regen.
 *
 * See GGO-16030 / GitHub issue #34.
 */

import { SDK_METADATA, SDKOptions } from "../lib/config.js";
import { RequestInput } from "../lib/http.js";
import {
  BeforeCreateRequestContext,
  BeforeCreateRequestHook,
} from "./types.js";

/** The usage-tracking header sent on every request. */
export const X_GBG_SOURCE_HEADER = "X-GBG-Source";

/**
 * SDK options extended with the optional `source` override. Use this to get
 * type-safety for the client-creation override without depending on the
 * regenerated `SDKOptions` declaration:
 *
 * ```ts
 * import { Go } from "@gbg/go-core";
 * import type { GoOptions } from "@gbg/go-core/hooks/x-gbg-source";
 *
 * const sdk = new Go({ source: "acme-portal" } satisfies GoOptions);
 * ```
 */
export type GoOptions = SDKOptions & {
  /**
   * Value sent in the `X-GBG-Source` header on every request, identifying the
   * integration making the call. Defaults to the SDK's user-agent string. Can
   * also be overridden per-request via `RequestOptions.headers`.
   */
  source?: string | undefined;
};

/**
 * Sets the `X-GBG-Source` header on every request. Precedence, highest first:
 *
 *   1. a per-request header (set via `RequestOptions.headers`) — left untouched
 *   2. the client-creation `source` option
 *   3. the SDK user-agent string (auto-tracks the SDK version)
 */
export class GbgSourceHook implements BeforeCreateRequestHook {
  beforeCreateRequest(
    hookCtx: BeforeCreateRequestContext,
    input: RequestInput,
  ): RequestInput {
    const options = input.options ?? {};
    const headers = new Headers(options.headers);

    // Respect a per-request override if one was already set on the request.
    if (!headers.has(X_GBG_SOURCE_HEADER)) {
      const source = (hookCtx.options as GoOptions).source;
      headers.set(X_GBG_SOURCE_HEADER, source ?? SDK_METADATA.userAgent);
    }

    options.headers = headers;
    input.options = options;
    return input;
  }
}
