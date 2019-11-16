# issue-generation-with-allof

sample code to consider an issue with allof settings

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
  "petType": null,
  "name": "kuro",
  "age": 1
}
```

```bash
$ curl -s localhost:8080/pet/cat | jq .
{
  "petType": null,
  "name": "kuro",
  "age": 1,
  "house": "myhome"
}
```

```bash
$ curl -s localhost:8080/pet/dog | jq .
{
  "petType": null,
  "name": "kuro",
  "age": 1,
  "bark": "bowwow"
}
```
