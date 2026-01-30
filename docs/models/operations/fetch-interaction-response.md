# FetchInteractionResponse

Success


## Supported Types

### `operations.ResponseBody`

```typescript
const value: operations.ResponseBody = {
  instanceId: "<id>",
  interactionId: "<id>",
  journey: {
    status: "Paused",
  },
  interaction: {
    collects: [],
    consumes: [
      {
        ref: "<value>",
        spec: "required",
      },
    ],
    grId: "<id>",
  },
  context: {},
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

