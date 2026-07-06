# FetchInteractionResponse

Success


## Supported Types

### `operations.ResponseBody1`

```typescript
const value: operations.ResponseBody1 = {
  instanceId: "<id>",
  interactionId: "<id>",
  journey: {
    status: "Completed",
  },
  interaction: {
    collects: [
      {
        ref: "<value>",
        spec: "optional",
      },
    ],
    consumes: [
      {
        ref: "<value>",
        spec: "optional",
      },
    ],
    grId: "<id>",
  },
};
```

### `operations.FetchInteractionError`

```typescript
const value: operations.FetchInteractionError = {
  status: "error",
  code: 6719.06,
  message: "<value>",
};
```

### `operations.ResponseBody2`

```typescript
const value: operations.ResponseBody2 = {
  instanceId: "<id>",
  journey: {
    status: "InProgress",
  },
  processing: false,
};
```

