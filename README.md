
#  Projeto REST API - User Management

Este projeto é uma API REST simples com **Spring Boot**, que permite criar, listar, atualizar e remover usuários diretamente da memória (sem banco de dados).

---

##  Como rodar o projeto

```bash
# Clone o repositório
git clone https://github.com/jornadev/api.rest.git
cd api-rest

# Rode com Maven (ou use sua IDE)
./mvnw spring-boot:run
```

API disponível em:  
http://localhost:8080

Collection disponível no postman com todas as requisições necessárias para testar a API: 

---

## Requisições disponíveis:

- **GET /users** → listar todos as usuários
  - **Exemplo de Request**:
    ```http
    GET http://localhost:8080/users
    ```
    **Exemplo de Resposta (JSON)**:
    ```json
    {
      "id": 0,
      "name": "Henrique",
      "age": "22",
    }
    ```

- **POST /users** → criar um usuário
  
  - **Exemplo de Request**:
    ```http
    POST http://localhost:8080/users
    ```

     **Exemplo de Body (JSON)**:
    ```json
    {
      "name": "Henrique",
      "age": "22",
    }
    ```
    
    **Exemplo de Resposta (JSON)**:
    ```json
    {
      "id": 0,
      "name": "Henrique",
      "age": "22",
    }
    ```

- **PUT /users/{id}** → atualizar um usuário
  
  - **Exemplo de Request**:
    ```http
    PUT http://localhost:8080/users/{/id}
    ```
     **Exemplo de Body (JSON)**:
    ```json
    {
      "name": "Teste",
      "age": 21
    }
    ```
    
    **Exemplo de Resposta (JSON)**:
    ```json
    {
      "id": 0,
      "name": "Teste",
      "age": 21
    }
    ```

- **DELETE /users/{id}** → deletar um usuário
  
  - **Exemplo de Request**:
    ```http
    DELETE http://localhost:8080/users/{id}
    ```
