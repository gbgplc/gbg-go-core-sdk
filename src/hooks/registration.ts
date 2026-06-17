import { Hooks } from "./types.js";
import { GbgSourceHook } from "./x-gbg-source.js";

/*
 * This file is only ever generated once on the first generation and then is free to be modified.
 * Any hooks you wish to add should be registered in the initHooks function. Feel free to define them
 * in this file or in separate files in the hooks folder.
 */

export function initHooks(hooks: Hooks) {
  // Stamp an X-GBG-Source usage-tracking header on every outgoing request.
  // See ./x-gbg-source.ts (GGO-16030 / issue #34).
  hooks.registerBeforeCreateRequestHook(new GbgSourceHook());
}
