# go-core-sdk

Developer-friendly & type-safe Java SDK specifically catered to leverage *go-core-sdk* API.

[![Built by Speakeasy](https://img.shields.io/badge/Built_by-SPEAKEASY-374151?style=for-the-badge&labelColor=f3f4f6)](https://www.speakeasy.com/?utm_source=go-core-sdk&utm_campaign=java)
[![License: MIT](https://img.shields.io/badge/LICENSE_//_MIT-3b5bdb?style=for-the-badge&labelColor=eff6ff)](https://opensource.org/licenses/MIT)


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/gbg/go). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

GBG GO Next Gen Flow Captain API: API for Customers and End Users to interact with the GBG GO Next Gen Flow Captain
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [go-core-sdk](#go-core-sdk)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
  * [Jackson Configuration](#jackson-configuration)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.gbg:go-core-sdk:0.1.0-alpha01'
```

Maven:
```xml
<dependency>
    <groupId>com.gbg</groupId>
    <artifactId>go-core-sdk</artifactId>
    <version>0.1.0-alpha01</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.PostAsTokenOauth2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        PostAsTokenOauth2Response res = sdk.tokens().generate()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import com.gbg.gocore.AsyncGo;
import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.async.PostAsTokenOauth2Response;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncGo sdk = Go.builder()
            .build()
            .toAsync();

        CompletableFuture<PostAsTokenOauth2Response> resFut = sdk.tokens().generate()
                .call();

        resFut.thenAccept(res -> {
            if (res.object().isPresent()) {
                System.out.println(res.object().get());
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html

#### Union Consumption Patterns

When a response field is a union model:

- Discriminated unions: branch on the discriminator (`switch`) and then narrow to the concrete type.
- Non-discriminated unions: use generated accessors (for example `string()`, `asLong()`, `simpleObject()`) to determine the active variant.

For full model-specific examples (including Java 11/16/21 variants), see each union model's **Supported Types** section in the generated model docs.
<!-- End SDK Example Usage [usage] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name             | Type | Scheme      |
| ---------------- | ---- | ----------- |
| `customerAccess` | http | HTTP Bearer |

To authenticate with the API the `customerAccess` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.PostAsTokenOauth2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        PostAsTokenOauth2Response res = sdk.tokens().generate()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Per-Operation Security Schemes

Some operations in this SDK require the security scheme to be specified at the request level. For example:
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.DeviceConnectRequest;
import com.gbg.gocore.models.operations.DeviceConnectResponse;
import com.gbg.gocore.models.operations.DeviceConnectSecurity;
import com.gbg.gocore.models.operations.DeviceInfo;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        DeviceConnectRequest req = DeviceConnectRequest.builder()
                .connectToken("s4FUx8Ny8ijXRtFigz3x1_8rb9bd_5ZD")
                .deviceInfo(DeviceInfo.builder()
                    .deviceId("exampleDeviceId123")
                    .deviceName("deviceName")
                    .deviceType("deviceType")
                    .build())
                .build();

        DeviceConnectResponse res = sdk.devices().connect()
                .request(req)
                .security(DeviceConnectSecurity.builder()
                    .deviceConnect(System.getenv().getOrDefault("DEVICE_CONNECT", ""))
                    .build())
                .call();

        if (res.twoHundredApplicationJsonObject().isPresent()) {
            System.out.println(res.twoHundredApplicationJsonObject().get());
        }
    }
}
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

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.


[`GoException`](./src/main/java/models/errors/GoException.java) is the base class for all HTTP error responses. It has the following properties:

| Method           | Type                        | Description                                                              |
| ---------------- | --------------------------- | ------------------------------------------------------------------------ |
| `message()`      | `String`                    | Error message                                                            |
| `code()`         | `int`                       | HTTP response status code eg `404`                                       |
| `headers`        | `Map<String, List<String>>` | HTTP response headers                                                    |
| `body()`         | `byte[]`                    | HTTP body as a byte array. Can be empty array if no body is returned.    |
| `bodyAsString()` | `String`                    | HTTP body as a UTF-8 string. Can be empty string if no body is returned. |
| `rawResponse()`  | `HttpResponse<?>`           | Raw HTTP response (body already read and not available for re-read)      |

### Example
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.GoException;
import com.gbg.gocore.models.operations.PostAsTokenOauth2Response;
import java.io.UncheckedIOException;
import java.lang.Exception;
import java.util.Optional;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();
        try {

            PostAsTokenOauth2Response res = sdk.tokens().generate()
                    .call();

            if (res.object().isPresent()) {
                System.out.println(res.object().get());
            }
        } catch (GoException ex) { // all SDK exceptions inherit from GoException

            // ex.ToString() provides a detailed error message including
            // HTTP status code, headers, and error payload (if any)
            System.out.println(ex);

            // Base exception fields
            var rawResponse = ex.rawResponse();
            var headers = ex.headers();
            var contentType = headers.first("Content-Type");
            int statusCode = ex.code();
            Optional<byte[]> responseBody = ex.body();
        } catch (UncheckedIOException ex) {
            // handle IO error (connection, timeout, etc)
        }    }
}
```

### Error Classes
**Primary error:**
* [`GoException`](./src/main/java/models/errors/GoException.java): The base class for HTTP error responses.

<details><summary>Less common errors (6)</summary>

<br />

**Network errors:**
* `java.io.IOException` (always wrapped by `java.io.UncheckedIOException`). Commonly encountered subclasses of
`IOException` include `java.net.ConnectException`, `java.net.SocketTimeoutException`, `EOFException` (there are
many more subclasses in the JDK platform).

**Inherit from [`GoException`](./src/main/java/models/errors/GoException.java)**:


</details>
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                         | Description |
| --- | ---------------------------------------------- | ----------- |
| 0   | `https://eu.platform.go.gbgplc.com/v2/captain` |             |
| 1   | `https://us.platform.go.gbgplc.com/v2/captain` |             |
| 2   | `https://au.platform.go.gbgplc.com/v2/captain` |             |

#### Example

```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.HealthResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .serverIndex(0)
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        HealthResponse res = sdk.health().get()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.HealthResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .serverURL("https://au.platform.go.gbgplc.com/v2/captain")
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        HealthResponse res = sdk.health().get()
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.PostAsTokenOauth2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        PostAsTokenOauth2Response res = sdk.tokens().generate()
                .serverURL("https://api.auth.gbgplc.com")
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import com.gbg.gocore.Go;
import com.gbg.gocore.utils.HTTPClient;
import com.gbg.gocore.utils.SpeakeasyHTTPClient;
import com.gbg.gocore.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        Go sdk = Go.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import com.gbg.gocore.Go;
import com.gbg.gocore.utils.HTTPClient;
import com.gbg.gocore.utils.Blob;
import com.gbg.gocore.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        Go sdk = Go.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import com.gbg.gocore.Go;
import com.gbg.gocore.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        Go sdk = Go.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug & Logging

#### SLF4j Logging
This SDK uses [SLF4j](https://www.slf4j.org/) for structured logging across HTTP requests, retries, pagination, streaming, and hooks. SLF4j provides comprehensive visibility into SDK operations.

**Log Levels:**
- **DEBUG**: High-level operations (HTTP requests/responses, retry attempts, page fetches, hook execution, stream lifecycle)
- **TRACE**: Detailed information (request/response bodies, backoff calculations, individual items processed)

**Configuration:**

Add your preferred SLF4j implementation to your project. For example, using Logback:

```gradle
dependencies {
    implementation 'ch.qos.logback:logback-classic:1.4.14'
}
```

Configure logging levels in your `logback.xml`:

```xml
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n</pattern>
        </encoder>
    </appender>

    <!-- SDK-wide logging -->
    <logger name="com.gbg.gocore" level="DEBUG"/>
    
    <!-- Component-specific logging -->
    <logger name="com.gbg.gocore.utils.SpeakeasyHTTPClient" level="DEBUG"/>
    <logger name="com.gbg.gocore.utils.Retries" level="DEBUG"/>
    <logger name="com.gbg.gocore.utils.pagination" level="DEBUG"/>
    <logger name="com.gbg.gocore.utils.Hooks" level="TRACE"/>
    
    <root level="INFO">
        <appender-ref ref="STDOUT"/>
    </root>
</configuration>
```

**What Gets Logged:**
- **HTTP Client**: Request/response details, headers (with sensitive headers redacted), bodies (at TRACE level)
- **Retries**: Retry attempts, backoff delays, exhaustion, non-retryable exceptions
- **Pagination**: Page fetches, pagination state, errors
- **Streaming**: Stream initialization, item processing, closure
- **Hooks**: Hook execution counts, operation IDs, exceptions

#### Legacy Debug Logging
For backward compatibility, you can still use the legacy debug logging method:

```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: Debug logging should only be used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default. You can specify additional redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.


#### JDK HTTP Client Logging
Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this option does not log request/response bodies.
<!-- End Debugging [debug] -->

<!-- Start Jackson Configuration [jackson] -->
## Jackson Configuration

The SDK ships with a pre-configured Jackson [`ObjectMapper`][jackson-databind] accessible via
`JSON.getMapper()`. It is set up with type modules, strict deserializers, and the feature flags
needed for full SDK compatibility (including ISO-8601 `OffsetDateTime` serialization):

```java
import com.gbg.gocore.utils.JSON;

String json = JSON.getMapper().writeValueAsString(response);
```

To compose with your own `ObjectMapper`, register the provided `GoCoreSDKJacksonModule`, which
bundles all the same modules and feature flags as a single plug-and-play module:

```java
import com.gbg.gocore.utils.GoCoreSDKJacksonModule;
import com.fasterxml.jackson.databind.ObjectMapper;

ObjectMapper myMapper = new ObjectMapper()
    .registerModule(new GoCoreSDKJacksonModule());

String json = myMapper.writeValueAsString(response);
```

[jackson-databind]: https://github.com/FasterXML/jackson-databind
[jackson-jsr310]: https://github.com/FasterXML/jackson-modules-java8/tree/master/datetime
<!-- End Jackson Configuration [jackson] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=go-core-sdk&utm_campaign=java)
