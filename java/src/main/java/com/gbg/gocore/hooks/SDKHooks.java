package com.gbg.gocore.hooks;

//
// This file is written once by speakeasy code generation and
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

public final class SDKHooks {

    /**
     * Stamps an X-GBG-Source usage-tracking header on every outgoing request.
     * See GbgSourceHook (GGO-16030 / issue #34). Stateless and thread-safe, so
     * one instance serves both the sync and async clients.
     *
     * <p>To identify a specific integration instead of the SDK user agent,
     * construct it with a source: {@code new GbgSourceHook("acme-portal")}.
     */
    private static final GbgSourceHook GBG_SOURCE_HOOK = new GbgSourceHook();

    private SDKHooks() {
        // prevent instantiation
    }

    public static void initialize(com.gbg.gocore.utils.Hooks hooks) {
        // register synchronous hooks here
        hooks.registerBeforeRequest(GBG_SOURCE_HOOK);
        // hooks.registerAfterSuccess(...);
        // hooks.registerAfterError(...);

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

    public static void initialize(com.gbg.gocore.utils.AsyncHooks asyncHooks) {
        // register async hooks here
        //
        // The async client is a separate code path: a hook registered on the
        // sync Hooks above does NOT apply here, so X-GBG-Source has to be
        // registered a second time or async callers would send no source
        // header at all.
        asyncHooks.registerBeforeRequest(
                com.gbg.gocore.utils.HookAdapters.toAsync(GBG_SOURCE_HOOK));
        // asyncHooks.registerBeforeRequest(...);
        // asyncHooks.registerAfterSuccess(...);
        // asyncHooks.registerAfterError(...);
        
        // NOTE: If you have existing synchronous hooks, you can adapt them using HookAdapters:
        // asyncHooks.registerAfterError(com.gbg.gocore.utils.HookAdapters.adapt(mySyncHook));
        
        // PERFORMANCE TIP: For better performance, implement async hooks directly using
        // non-blocking I/O (NIO) APIs instead of adapting synchronous hooks, as adapters
        // offload execution to the ForkJoinPool which can introduce overhead.

        // for more information see
        // https://www.speakeasy.com/docs/additional-features/sdk-hooks
    }

}
