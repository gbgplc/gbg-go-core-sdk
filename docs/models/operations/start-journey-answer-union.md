# StartJourneyAnswerUnion


## Supported Types

### `operations.StartJourneyAnswerDone`

```typescript
const value: operations.StartJourneyAnswerDone = {
  status: "done",
  results: {},
};
```

### `operations.StartJourneyAnswerTimeout`

```typescript
const value: operations.StartJourneyAnswerTimeout = {
  status: "timeout",
};
```

### `operations.StartJourneyAnswerError1`

```typescript
const value: operations.StartJourneyAnswerError1 = {
  status: "error",
  error: {
    name: "<value>",
    message: "<value>",
  },
};
```

