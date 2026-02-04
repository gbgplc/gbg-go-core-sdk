<!-- Start SDK Example Usage [usage] -->
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