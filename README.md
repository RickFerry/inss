#### `README.md`
```markdown
# INSS API

Este projeto é uma API para manter o cadastro de beneficiários de um plano de saúde, utilizando Java, Spring Boot e H2 Database.

## Funcionalidades

- Cadastrar um beneficiário junto com seus documentos.
- Listar todos os beneficiários cadastrados.
- Listar todos os documentos de um beneficiário a partir de seu ID.
- Atualizar os dados cadastrais de um beneficiário.
- Remover um beneficiário.
- Implementar autenticação/autorização para acesso aos endpoints.
- Configurações de CORS.

## Estrutura do Projeto

```plaintext
inss/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── ekan/
│   │   │           └── inss/
│   │   │               ├── InssApplication.java
│   │   │               ├── config/
│   │   │               │   ├── CorsConfig.java
│   │   │               │   ├── SecurityConfig.java
│   │   │               │   └── SwaggerConfig.java
│   │   │               ├── controller/
│   │   │               │   ├── BeneficiaryController.java
│   │   │               │   └── DocumentController.java
│   │   │               ├── dto/
│   │   │               │   └── BeneficiaryDTO.java
│   │   │               ├── model/
│   │   │               │   ├── Beneficiary.java
│   │   │               │   └── Document.java
│   │   │               ├── repository/
│   │   │               │   ├── BeneficiaryRepository.java
│   │   │               │   └── DocumentRepository.java
│   │   │               ├── service/
│   │   │               │   ├── BeneficiaryService.java
│   │   │               │   └── DocumentService.java
│   │   │               └── util/
│   │   │                   └── ModelMapperConfig.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
├── pom.xml
```

## Tecnologias Utilizadas

- Java 11
- Spring Boot 2.5
- H2 Database
- ModelMapper
- JPA (Hibernate)
- Swagger 2
- Spring Security

## Configuração do Ambiente

1. Certifique-se de ter o JDK 11 instalado.
2. Clone o repositório:
    ```sh
    git clone https://github.com/seu-usuario/inss.git
    cd inss
    ```
3. Compile e execute o projeto:
    ```sh
    mvn spring-boot:run
    ```

## Endpoints da API

Os endpoints documentados podem ser acessados através do Swagger:

```
http://localhost:8080/swagger-ui/
```

## Exemplos de Uso

### Cadastrar um Beneficiário

`POST /api/beneficiaries`

```json
{
    "name": "John Doe",
    "phone": "123456789",
    "birthDate": "1980-01-01",
    "documents": [
        {
            "documentType": "Passport",
            "description": "Passport Document"
        }
    ]
}
```

### Listar Todos os Beneficiários

`GET /api/beneficiaries`

### Listar Documentos de um Beneficiário

`GET /api/documents/beneficiary/{beneficiaryId}`

### Atualizar um Beneficiário

`PUT /api/beneficiaries/{id}`

```json
{
    "name": "Jane Doe",
    "phone": "987654321",
    "birthDate": "1985-02-02"
}
```

### Remover um Beneficiário

`DELETE /api/beneficiaries/{id}`

## Autenticação

A autenticação é feita utilizando Basic Auth. As credenciais podem ser configuradas no `application.properties`.

## Contribuição

1. Faça um fork do projeto.
2. Crie uma branch para a sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Faça o push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.

## Licença

Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.
```
