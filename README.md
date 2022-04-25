# dsclient
Repository for SpringBoot Tests

This project contains an REST API for basic CRUD operations.

For example:
# Create 
http://localhost:8080/clients?page=0&size=12&sort=name,asc POST VERB
{
    "name": "Gabriel Vieira",
    "cpf": 12345,
    "income": 5000.0,
    "children": 1
}

# Read
http://localhost:8080/clients?page=0&size=12&sort=name,asc GET VERB


# Update
http://localhost:8080/clients/1
{
    "name": "Gabriel Vieira",
    "cpf": 12345,
    "income": 5000.0,
    "children": 1
}

# Delete 
curl --location --request DELETE 'localhost:8080/clients/1' 


