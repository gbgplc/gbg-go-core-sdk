# GetJourneyStateResponse

Journey state (full by default; slim with ?view=slim)


## Supported Types

### `models.StateFetchResponse`

```typescript
const value: models.StateFetchResponse = {
  view: "full",
  instanceId: "<id>",
  status: "<value>",
};
```

### `models.SlimStateFetchResponse`

```typescript
const value: models.SlimStateFetchResponse = {
  view: "slim",
  instanceId: "<id>",
  status: "Error",
};
```

