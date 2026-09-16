# PostAsTokenOauth2ResponseBody

Successfully retrieved access token.


## Fields

| Field                                     | Setter Type                               | Getter Type                               | Required                                  | Description                               |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| `accessToken`                             | @Nullable *String*                        | Optional\<*String*>                       | :heavy_minus_sign:                        | The access token used for authentication. |
| `expiresIn`                               | @Nullable *long*                          | Optional\<*long*>                         | :heavy_minus_sign:                        | Token expiration time in seconds.         |
| `tokenType`                               | @Nullable *String*                        | Optional\<*String*>                       | :heavy_minus_sign:                        | The type of token, usually 'Bearer'.      |