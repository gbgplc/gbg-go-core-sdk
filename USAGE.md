<!-- Start SDK Example Usage [usage] -->
```typescript
import { Go } from "@gbg/go-core";

const go = new Go();

async function run() {
  const result = await go.tokens.generate();

  console.log(result);
}

run();

```
<!-- End SDK Example Usage [usage] -->