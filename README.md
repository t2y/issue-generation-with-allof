# issue-generation-with-allof

sample code to consider an issue with allof settings

* https://github.com/OpenAPITools/openapi-generator/issues/2845
* https://github.com/OpenAPITools/openapi-generator/issues/3100

## How to build

to generate source code with open-generator from [openapi.yaml](openapi.yaml)

```bash
$ gradle clean openApiGenerate
```

## How to boot

```bash
$ gradle bootRun
```

## Test

```bash
$ curl -s localhost:8080/pet | jq .
{
  "petType": "Pet",
  "name": "kuro",
  "age": 1
}
```

```bash
$ curl -s localhost:8080/pet/cat | jq .
{
  "petType": "myCat",
  "name": "kuro",
  "age": 1,
  "house": "myhome"
}
```

```bash
$ curl -s localhost:8080/pet/dog | jq .
{
  "petType": "myDog",
  "name": "kuro",
  "age": 1,
  "bark": "bowwow"
}
```
