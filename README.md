# SpringBoot GraphQL App - A CRUD Java Spring Boot with GraphQL

![](https://raw.githubusercontent.com/NEDONION/my-pics-space/main/20230516195155.png)

## Requisites
- Java
- Spring Boot
- JPA
- GraphQL

## Get Started
- Clone the repository, and install Maven Dependencies
- http://localhost:8088/graphiql

## Query (Read)

### 1. Get All Persons

```graphql
{
  getAllPersons {
    person_id
    name
    addressId
    address {
      address_id
      city
      zipcode
    }
  }
}
```

```json
//Output:
{
  "data": {
    "getAllPersons": [
      {
        "person_id": "1",
        "name": "Richard",
        "addressId": 1,
        "address": {
          "address_id": "1",
          "city": "New York City",
          "zipcode": "10001"
        }
      },
      {
        "person_id": "2",
        "name": "Nate",
        "addressId": 2,
        "address": {
          "address_id": "2",
          "city": "Dallas",
          "zipcode": "20002"
        }
      },
      {
        "person_id": "3",
        "name": "Lucy",
        "addressId": 3,
        "address": {
          "address_id": "3",
          "city": "LA",
          "zipcode": "30003"
        }
      }
    ]
  }
}
```

### 2. Get All Address

```graphql
{
  getAllAddress {
    address_id
    city
    zipcode
  }
}
```

```json
//Output:
{
  "data": {
    "getAllAddress": [
      {
        "address_id": "1",
        "city": "New York City",
        "zipcode": "10001"
      },
      {
        "address_id": "2",
        "city": "Dallas",
        "zipcode": "20002"
      },
      {
        "address_id": "3",
        "city": "LA",
        "zipcode": "30003"
      }
    ]
  }
}
```

### 3. Get Person And Address By Id

```graphql
{
  getPersonById(person_id: 1) {
    person_id
    name
    email
    addressId
    address {
      address_id
      city
      zipcode
    }
  }
}
```

```json
//Output:
{
  "data": {
    "getPersonById": {
      "person_id": "1",
      "name": "Richard",
      "email": "Richard@test.com",
      "addressId": 1,
      "address": {
        "address_id": "1",
        "city": "New York City",
        "zipcode": "10001"
      }
    }
  }
}
```

## Mutation (Write)
### 1. Create Address

```graphql
mutation {
  createAddress(city: "Austin", zipcode: "78717") {
    address_id
    city
    zipcode
  }
}
```

```json
//Output:
{
  "data": {
    "createAddress": {
      "address_id": "4",
      "city": "Austin",
      "zipcode": "78717"
    }
  }
}
```

### 2. Create Person

```graphql
mutation {
  createPerson(name: "Jiacheng", addressId: 4, email: "743160803@qq.com") {
    person_id
    name
    addressId
    email
  }
}
```

```json
//Output:
{
  "data": {
    "createPerson": {
      "person_id": "4",
      "name": "Jiacheng",
      "addressId": 4,
      "email": "743160803@qq.com"
    }
  }
}
```

### 3. Delete Address

```graphql
mutation {
  deleteAddress(address_id: 3)
}
```

```json
//Output:
{
  "data": {
    "deleteAddress": true
  }
}
```

**What happens if we fetch data for `person_id = 3` now?**

```json
//Output:
{
  "data": {
    "getPersonById": {
      "person_id": "3",
      "name": "Lucy",
      "email": "ar_alok@accionlabs.com",
      "addressId": 3,
      "address": null
    }
  },
  "errors": [
    {
      "message": "Internal Server Error(s) while executing query",
      "extensions": null,
      "path": null
    }
  ]
}
```


### 4. Delete Person
```graphql
mutation {
  deletePerson(person_id: 3)
}
```

```json
//Output:
{
  "data": {
    "deletePerson": true
  }
}
```
