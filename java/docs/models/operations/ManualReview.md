# ManualReview

Reviewer-supplied manual-review input: a required decision ordinal plus optional notes. Identity fields are Captain-populated and rejected here.


## Fields

| Field                                                     | Setter Type                                               | Getter Type                                               | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `decision`                                                | *long*                                                    | *long*                                                    | :heavy_check_mark:                                        | Ordinal decision outcome (0-9) submitted by the reviewer  |
| `notes`                                                   | @Nullable *String*                                        | Optional\<*String*>                                       | :heavy_minus_sign:                                        | Free-text justification or notes provided by the reviewer |