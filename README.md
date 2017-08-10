# potluck


IPO diagram

| Input                                 | Processing                                                      | Output                                           |
| ------------------------------------- | --------------------------------------------------------------- | ------------------------------------------------ |
|                                       |                                                                 | welcome page, prompt user to choose              |
| choose add a dish                     | go to route "/adish"                                            |                                                  |
|  --add first name, last name and dish | get first name, last name and dish (post method)                | display addition result on HTML                  |
|                                       | If validation has errors, go back to "/adish"                   |                                                  |
| choose search by a dish               | go to route "/searchdish"                                       |                                                  |
| --enter a dish name                   | get dish name, search such dish in database, and return result  | display dish searched result on HTML             |
|                                       | If no match, return no match message                            |                                                  |
| choose search by a chef               | go to route "/searchchef"                                       |                                                  |
| --enter a chef name                   | get chef name, search such chef in database, and return result  | display chef searched result on HTML             |
|                                       | If no match, return no match message                            |                                                  |
| choose display all dishes/chefs       | go to route "/displayall"                                       |                                                  |
|                                       | search all records in the database                              | display all dishes/chefs in the database on HTML |
|                                       |                                                                 |                                                  |
