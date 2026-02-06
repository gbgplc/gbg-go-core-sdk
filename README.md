# @gbg/go-core

Developer-friendly & type-safe Typescript SDK specifically catered to leverage *@gbg/go-core* API.

[![Built by Speakeasy](https://img.shields.io/badge/Built_by-SPEAKEASY-374151?style=for-the-badge&labelColor=f3f4f6)](https://www.speakeasy.com/?utm_source=@gbg/go-core&utm_campaign=typescript)
[![License: MIT](https://img.shields.io/badge/LICENSE_//_MIT-3b5bdb?style=for-the-badge&labelColor=eff6ff)](https://opensource.org/licenses/MIT)


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/a-6zk/gbg). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

GBG GO Next Gen Flow Captain API: API for Customers and End Users to interact with the GBG GO Next Gen Flow Captain
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [@gbg/go-core](#gbggo-core)
  * [SDK Installation](#sdk-installation)
  * [Requirements](#requirements)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Standalone functions](#standalone-functions)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

> [!TIP]
> To finish publishing your SDK to npm and others you must [run your first generation action](https://www.speakeasy.com/docs/github-setup#step-by-step-guide).


The SDK can be installed with either [npm](https://www.npmjs.com/), [pnpm](https://pnpm.io/), [bun](https://bun.sh/) or [yarn](https://classic.yarnpkg.com/en/) package managers.

### NPM

```bash
npm add https://github.com/gbgplc/gbg-go-core-sdk
```

### PNPM

```bash
pnpm add https://github.com/gbgplc/gbg-go-core-sdk
```

### Bun

```bash
bun add https://github.com/gbgplc/gbg-go-core-sdk
```

### Yarn

```bash
yarn add https://github.com/gbgplc/gbg-go-core-sdk
```

> [!NOTE]
> This package is published with CommonJS and ES Modules (ESM) support.
<!-- End SDK Installation [installation] -->

<!-- Start Requirements [requirements] -->
## Requirements

For supported JavaScript runtimes, please consult [RUNTIMES.md](RUNTIMES.md).
<!-- End Requirements [requirements] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name             | Type | Scheme      | Environment Variable |
| ---------------- | ---- | ----------- | -------------------- |
| `customerAccess` | http | HTTP Bearer | `GO_CUSTOMER_ACCESS` |

To authenticate with the API the `customerAccess` parameter must be set when initializing the SDK client instance. For example:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();

```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.devices.connect({
    deviceConnect: process.env["GO_DEVICE_CONNECT"] ?? "",
  }, {
    connectToken: "s4FUx8Ny8ijXRtFigz3x1_8rb9bd_5ZD",
    deviceInfo: {
      deviceId: "exampleDeviceId123",
      deviceName: "deviceName",
      deviceType: "deviceType",
    },
  });

  console.log(result);
}

run();

```
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [Devices](docs/sdks/devices/README.md)

* [connect](docs/sdks/devices/README.md#connect) - Connect or Refresh End User Device
* [add](docs/sdks/devices/README.md#add) - Create Connect Secret

### [Health](docs/sdks/health/README.md)

* [get](docs/sdks/health/README.md#get) - Obtain the flow-captain health status

### [Instances](docs/sdks/instances/README.md)

* [delete](docs/sdks/instances/README.md#delete) - Delete instance

### [Interactions](docs/sdks/interactions/README.md)

* [submit](docs/sdks/interactions/README.md#submit) - Submit Interaction
* [fetch](docs/sdks/interactions/README.md#fetch) - Fetch Interaction

### [Journeys](docs/sdks/journeys/README.md)

* [start](docs/sdks/journeys/README.md#start) - Start Journey
* [getState](docs/sdks/journeys/README.md#getstate) - Get State Data

### [Tasks](docs/sdks/tasks/README.md)

* [list](docs/sdks/tasks/README.md#list) - Get End User Tasks
* [update](docs/sdks/tasks/README.md#update) - Put End User Data
* [getSchema](docs/sdks/tasks/README.md#getschema) - Get Task Schema
* [listSchema](docs/sdks/tasks/README.md#listschema) - Get Tasks Schema

### [Tokens](docs/sdks/tokens/README.md)

* [generate](docs/sdks/tokens/README.md#generate) - Generate access token

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Standalone functions [standalone-funcs] -->
## Standalone functions

All the methods listed above are available as standalone functions. These
functions are ideal for use in applications running in the browser, serverless
runtimes or other environments where application bundle size is a primary
concern. When using a bundler to build your application, all unused
functionality will be either excluded from the final bundle or tree-shaken away.

To read more about standalone functions, check [FUNCTIONS.md](./FUNCTIONS.md).

<details>

<summary>Available standalone functions</summary>

- [`devicesAdd`](docs/sdks/devices/README.md#add) - Create Connect Secret
- [`devicesConnect`](docs/sdks/devices/README.md#connect) - Connect or Refresh End User Device
- [`healthGet`](docs/sdks/health/README.md#get) - Obtain the flow-captain health status
- [`instancesDelete`](docs/sdks/instances/README.md#delete) - Delete instance
- [`interactionsFetch`](docs/sdks/interactions/README.md#fetch) - Fetch Interaction
- [`interactionsSubmit`](docs/sdks/interactions/README.md#submit) - Submit Interaction
- [`journeysGetState`](docs/sdks/journeys/README.md#getstate) - Get State Data
- [`journeysStart`](docs/sdks/journeys/README.md#start) - Start Journey
- [`tasksGetSchema`](docs/sdks/tasks/README.md#getschema) - Get Task Schema
- [`tasksList`](docs/sdks/tasks/README.md#list) - Get End User Tasks
- [`tasksListSchema`](docs/sdks/tasks/README.md#listschema) - Get Tasks Schema
- [`tasksUpdate`](docs/sdks/tasks/README.md#update) - Put End User Data
- [`tokensGenerate`](docs/sdks/tokens/README.md#generate) - Generate access token

</details>
<!-- End Standalone functions [standalone-funcs] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries.  If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API.  However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, simply provide a retryConfig object to the call:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  }, {
    retries: {
      strategy: "backoff",
      backoff: {
        initialInterval: 1,
        maxInterval: 50,
        exponent: 1.1,
        maxElapsedTime: 100,
      },
      retryConnectionErrors: false,
    },
  });

  console.log(result);
}

run();

```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a retryConfig at SDK initialization:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  retryConfig: {
    strategy: "backoff",
    backoff: {
      initialInterval: 1,
      maxInterval: 50,
      exponent: 1.1,
      maxElapsedTime: 100,
    },
    retryConnectionErrors: false,
  },
});

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();

```
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

[`GoError`](./src/models/errors/go-error.ts) is the base class for all HTTP error responses. It has the following properties:

| Property            | Type       | Description                                            |
| ------------------- | ---------- | ------------------------------------------------------ |
| `error.message`     | `string`   | Error message                                          |
| `error.statusCode`  | `number`   | HTTP response status code eg `404`                     |
| `error.headers`     | `Headers`  | HTTP response headers                                  |
| `error.body`        | `string`   | HTTP body. Can be empty string if no body is returned. |
| `error.rawResponse` | `Response` | Raw HTTP response                                      |

### Example
```typescript
import { Go } from "@gbg/go-core";
import * as errors from "@gbg/go-core/models/errors";

const go = new Go();

async function run() {
  try {
    const result = await go.tokens.generate({
      clientId: "your-client-id",
      clientSecret: "your-client-secret",
      username: "api-user@example.com",
      password: "your-secure-password",
      grantType: "password",
    });

    console.log(result);
  } catch (error) {
    if (error instanceof errors.GoError) {
      console.log(error.message);
      console.log(error.statusCode);
      console.log(error.body);
      console.log(error.headers);
    }
  }
}

run();

```

### Error Classes
**Primary error:**
* [`GoError`](./src/models/errors/go-error.ts): The base class for HTTP error responses.

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* [`ConnectionError`](./src/models/errors/http-client-errors.ts): HTTP client was unable to make a request to a server.
* [`RequestTimeoutError`](./src/models/errors/http-client-errors.ts): HTTP request timed out due to an AbortSignal signal.
* [`RequestAbortedError`](./src/models/errors/http-client-errors.ts): HTTP request was aborted by the client.
* [`InvalidRequestError`](./src/models/errors/http-client-errors.ts): Any input used to create a request is invalid.
* [`UnexpectedClientError`](./src/models/errors/http-client-errors.ts): Unrecognised or unexpected error.


**Inherit from [`GoError`](./src/models/errors/go-error.ts)**:
* [`ResponseValidationError`](./src/models/errors/response-validation-error.ts): Type mismatch between the data returned from the server and the structure expected by the SDK. See `error.rawValue` for the raw value and `error.pretty()` for a nicely formatted multi-line string.

</details>
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIdx: number` optional parameter when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                         | Description |
| --- | ---------------------------------------------- | ----------- |
| 0   | `https://eu.platform.go.gbgplc.com/v2/captain` |             |
| 1   | `https://us.platform.go.gbgplc.com/v2/captain` |             |
| 2   | `https://au.platform.go.gbgplc.com/v2/captain` |             |

#### Example

```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  serverIdx: 0,
});

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();

```

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL: string` optional parameter when initializing the SDK client instance. For example:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  serverURL: "https://au.platform.go.gbgplc.com/v2/captain",
});

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  });

  console.log(result);
}

run();

```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.tokens.generate({
    clientId: "your-client-id",
    clientSecret: "your-client-secret",
    username: "api-user@example.com",
    password: "your-secure-password",
    grantType: "password",
  }, {
    serverURL: "https://gbggo4-dev.nonprod.fabric.gbgplatforms.com",
  });

  console.log(result);
}

run();

```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The TypeScript SDK makes API calls using an `HTTPClient` that wraps the native
[Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API). This
client is a thin wrapper around `fetch` and provides the ability to attach hooks
around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` constructor takes an optional `fetcher` argument that can be
used to integrate a third-party HTTP client or when writing tests to mock out
the HTTP client and feed in fixtures.

The following example shows how to use the `"beforeRequest"` hook to to add a
custom header and a timeout to requests and how to use the `"requestError"` hook
to log errors:

```typescript
import { Go } from "@gbg/go-core";
import { HTTPClient } from "@gbg/go-core/lib/http";

const httpClient = new HTTPClient({
  // fetcher takes a function that has the same signature as native `fetch`.
  fetcher: (request) => {
    return fetch(request);
  }
});

httpClient.addHook("beforeRequest", (request) => {
  const nextRequest = new Request(request, {
    signal: request.signal || AbortSignal.timeout(5000)
  });

  nextRequest.headers.set("x-custom-header", "custom value");

  return nextRequest;
});

httpClient.addHook("requestError", (error, request) => {
  console.group("Request Error");
  console.log("Reason:", `${error}`);
  console.log("Endpoint:", `${request.method} ${request.url}`);
  console.groupEnd();
});

const sdk = new Go({ httpClient: httpClient });
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

You can setup your SDK to emit debug logs for SDK requests and responses.

You can pass a logger that matches `console`'s interface as an SDK option.

> [!WARNING]
> Beware that debug logging will reveal secrets, like API tokens in headers, in log messages printed to a console or files. It's recommended to use this feature only during local development and not in production.

```typescript
import { Go } from "@gbg/go-core";

const sdk = new Go({ debugLogger: console });
```

You can also enable a default debug logger by setting an environment variable `GO_DEBUG` to true.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=@gbg/go-core&utm_campaign=typescript)
