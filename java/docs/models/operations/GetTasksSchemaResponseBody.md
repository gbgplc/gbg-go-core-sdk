# GetTasksSchemaResponseBody

Success


## Fields

| Field                                                                      | Setter Type                                                                | Getter Type                                                                | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `instanceId`                                                               | *String*                                                                   | *String*                                                                   | :heavy_check_mark:                                                         | Journey Instance Id, a unique identifier for a started journey instance.   |
| `status`                                                                   | [GetTasksSchemaStatus](../../models/operations/GetTasksSchemaStatus.md)    | [GetTasksSchemaStatus](../../models/operations/GetTasksSchemaStatus.md)    | :heavy_check_mark:                                                         | N/A                                                                        |
| `tasks`                                                                    | List\<[GetTasksSchemaTask](../../models/operations/GetTasksSchemaTask.md)> | List\<[GetTasksSchemaTask](../../models/operations/GetTasksSchemaTask.md)> | :heavy_check_mark:                                                         | N/A                                                                        |
| `schemas`                                                                  | Map\<String, [Schemas](../../models/operations/Schemas.md)>                | Map\<String, [Schemas](../../models/operations/Schemas.md)>                | :heavy_check_mark:                                                         | N/A                                                                        |