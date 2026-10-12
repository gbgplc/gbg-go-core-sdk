# FetchInteractionResponse

Interaction state (full by default; slim with ?view=slim)


## Supported Types

### `models.InteractionFetchResponse`

```typescript
const value: models.InteractionFetchResponse = {
  instanceId: "<id>",
  journey: {
    status: "<value>",
  },
};
```

### `models.SlimInteractionFetchResponse`

```typescript
const value: models.SlimInteractionFetchResponse = {
  instanceId: "<id>",
  journey: {
    status: "Failed",
  },
};
```

