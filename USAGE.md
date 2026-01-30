<!-- Start SDK Example Usage [usage] -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go({
  customerAccess: process.env["GO_CUSTOMER_ACCESS"] ?? "",
});

async function run() {
  const result = await go.health.get();

  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->