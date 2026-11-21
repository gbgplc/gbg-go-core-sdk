# SubmitInteractionAnswerUnion


## Supported Types

### `operations.SubmitInteractionAnswerDone`

```typescript
const value: operations.SubmitInteractionAnswerDone = {
  status: "done",
  results: {},
};
```

### `operations.SubmitInteractionAnswerTimeout`

```typescript
const value: operations.SubmitInteractionAnswerTimeout = {
  status: "timeout",
};
```

### `operations.SubmitInteractionAnswerError1`

```typescript
const value: operations.SubmitInteractionAnswerError1 = {
  status: "error",
  error: {
    name: "<value>",
    message: "<value>",
  },
};
```

