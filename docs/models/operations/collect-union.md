# CollectUnion


## Supported Types

### `operations.Collect1`

```typescript
const value: operations.Collect1 = {
  ref: "<value>",
  spec: "optional",
};
```

### `operations.Collect2`

```typescript
const value: operations.Collect2 = {
  ref: "<value>",
  spec: "required",
  combinator: "<value>",
  inputs: [
    {
      ref: "<value>",
      spec: "required",
    },
  ],
};
```

