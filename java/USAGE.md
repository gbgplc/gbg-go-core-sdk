<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.gbg.gocore.Go;
import com.gbg.gocore.models.errors.ErrorResponse;
import com.gbg.gocore.models.operations.StartJourneyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ErrorResponse, Exception {

        Go sdk = Go.builder()
                .customerAccess(System.getenv().getOrDefault("CUSTOMER_ACCESS", ""))
            .build();

        StartJourneyResponse res = sdk.journeys().start()
                .call();

        if (res.journeyStartResponse().isPresent()) {
            System.out.println(res.journeyStartResponse().get());
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->