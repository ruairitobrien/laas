laas-rest-service
==================

laas - Langer as a Service

This is just a simple app to demonstrate a basic Spring REST implementation.

For the sake of having some functionality this is mimicking the brilliant http://foaas.herokuapp.com/
Except using the Cork specific term, langer instead.

##Usage


#####GET
| Request  | Output |
| ------------- | ------------- |
| /  | Returns a default message  |
| /{from}/{to}  | Returns a message addressed to the {to} parameter, signed form the {form} parameter  |
|/some/{from}/{to} | Some langer message |
|/whata/{from}/{to} | What a langer message |

#####POST
| Request URL | Data | Output |
| ----------- | ---- | ------ |
| /langer | { "option": "some option", "from":"who from", "to":"who to"} | Returns a message based on the options submitted |

#####PUT
| Request URL | Data | Output |
| ----------- | ---- | ------ |
| /langer | { "option": "some option", "from":"who from", "to":"who to"} | Just returns a sample message |


#####DELETE
| Request URL | Data | Output |
| ----------- | ---- | ------ |
| /langer | { "option": "some option", "from":"who from", "to":"who to"} | Just returns a sample message |


