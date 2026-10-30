# FetchInteractionResponse

Interaction state (full by default; slim with ?view=slim)


## Supported Types

### `models.InteractionFetchResponse`

```typescript
const value: models.InteractionFetchResponse = {
  view: "full",
  instanceId: "<id>",
  journey: {
    status: "<value>",
  },
  outstandingGroups: [
    {
      elementId: "<id>",
      cardinality: "at-least-one",
      refs: [
        "<value 1>",
        "<value 2>",
        "<value 3>",
      ],
    },
  ],
};
```

### `models.SlimInteractionFetchResponse`

```typescript
const value: models.SlimInteractionFetchResponse = {
  view: "slim",
  instanceId: "<id>",
  journey: {
    status: "Failed",
  },
  outstandingGroups: [
    {
      elementId: "<id>",
      cardinality: "at-least-one",
      refs: [
        "<value 1>",
        "<value 2>",
        "<value 3>",
      ],
    },
  ],
};
```

