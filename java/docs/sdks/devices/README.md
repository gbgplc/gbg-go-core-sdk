# Devices

## Overview

### Available Operations

* [add](#add) - Generate connect token
* [connect](#connect) - Complete the device-onboarding handshake
* [refresh](#refresh) - Renew a device session
* [validate](#validate) - Validate end-user session

## add

Generates a one-time connect token for device onboarding.

### Example Usage

<!-- UsageSnippet language="java" operationID="addDevice" method="post" path="/v2/captain/journey/device/start" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.AddDeviceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        AddDeviceResponse res = sdk.devices().add()
                .call();

        if (res.deviceStartResponse().isPresent()) {
            System.out.println(res.deviceStartResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [AddDeviceRequest](../../models/operations/AddDeviceRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[AddDeviceResponse](../../models/operations/AddDeviceResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401, 403, 404          | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## connect

Completes the device-onboarding handshake. See partner integration guide.

### Example Usage

<!-- UsageSnippet language="java" operationID="deviceConnect" method="post" path="/v2/captain/journey/device/connect" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeviceConnectRequest;
import com.gbg.gocore.models.operations.DeviceConnectResponse;
import com.gbg.gocore.models.operations.DeviceConnectSecurity;
import com.gbg.gocore.models.operations.DeviceInfo;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        DeviceConnectRequest req = DeviceConnectRequest.builder()
                .connectToken("<value>")
                .deviceInfo(DeviceInfo.builder()
                    .deviceId("<id>")
                    .build())
                .build();

        DeviceConnectResponse res = sdk.devices().connect()
                .request(req)
                .security(DeviceConnectSecurity.builder()
                    .deviceConnect(System.getenv().getOrDefault("DEVICE_CONNECT", ""))
                    .build())
                .call();

        if (res.deviceConnectResponse().isPresent()) {
            System.out.println(res.deviceConnectResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [DeviceConnectRequest](../../models/operations/DeviceConnectRequest.md)                                    | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [com.gbg.gocore.models.operations.DeviceConnectSecurity](../../models/operations/DeviceConnectSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |

### Response

**[DeviceConnectResponse](../../models/operations/DeviceConnectResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 400, 401                    | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## refresh

Renews a device session. See partner integration guide.

### Example Usage

<!-- UsageSnippet language="java" operationID="deviceRefresh" method="post" path="/v2/captain/journey/device/refresh" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeviceRefreshResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        DeviceRefreshResponse res = sdk.devices().refresh()
                .call();

        if (res.deviceRefreshResponse().isPresent()) {
            System.out.println(res.deviceRefreshResponse().get());
        }
    }
}
```

### Response

**[DeviceRefreshResponse](../../models/operations/DeviceRefreshResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401                         | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |

## validate

Validates an end-user JWT and returns session information.

### Example Usage

<!-- UsageSnippet language="java" operationID="deviceValidate" method="post" path="/v2/captain/journey/device/validate" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.DeviceValidateResponse;
import com.gbg.gocore.models.operations.DeviceValidateSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
            .build();

        DeviceValidateResponse res = sdk.devices().validate()
                .security(DeviceValidateSecurity.builder()
                    .interactionAccess(System.getenv().getOrDefault("INTERACTION_ACCESS", ""))
                    .build())
                .call();

        if (res.deviceValidateResponse().isPresent()) {
            System.out.println(res.deviceValidateResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                   | [com.gbg.gocore.models.operations.DeviceValidateSecurity](../../models/operations/DeviceValidateSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |

### Response

**[DeviceValidateResponse](../../models/operations/DeviceValidateResponse.md)**

### Errors

| Error Type                  | Status Code                 | Content Type                |
| --------------------------- | --------------------------- | --------------------------- |
| models/errors/ErrorResponse | 401                         | application/json            |
| models/errors/ErrorResponse | 500                         | application/json            |
| models/errors/APIException  | 4XX, 5XX                    | \*/\*                       |