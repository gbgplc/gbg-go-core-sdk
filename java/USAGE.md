<!-- Start SDK Example Usage [usage] -->
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
<!-- End SDK Example Usage [usage] -->