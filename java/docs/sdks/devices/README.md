# Devices

## Overview

### Available Operations

* [connect](#connect) - Connect or Refresh End User Device
* [add](#add) - Create Connect Secret

## connect

Connect or Refresh End User Device

### Example Usage

<!-- UsageSnippet language="java" operationID="deviceConnect" method="post" path="/journey/device/connect" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.DeviceConnectResponse;
import com.gbg.gocore.models.operations.DeviceConnectSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
            .build();

        DeviceConnectResponse res = sdk.devices().connect()
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

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [DeviceConnectRequest](../../models/operations/DeviceConnectRequest.md)                                    | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [com.gbg.gocore.models.operations.DeviceConnectSecurity](../../models/operations/DeviceConnectSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |

### Response

**[DeviceConnectResponse](../../models/operations/DeviceConnectResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## add

Create Connect Secret

### Example Usage

<!-- UsageSnippet language="java" operationID="addDevice" method="post" path="/journey/device/start" example="Default" -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.operations.AddDeviceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        AddDeviceResponse res = sdk.devices().add()
                .call();

        if (res.twoHundredApplicationJsonObject().isPresent()) {
            System.out.println(res.twoHundredApplicationJsonObject().get());
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |