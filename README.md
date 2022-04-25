# Projeto web services com Spring Boot e JPA/Hibernate 

This project aims to be a building block for several lambdas and other services.

## Development Requirements

Requirements:
* springboot
* java11



## Development steps:

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções 

### Running tests
## Teste banco de dados online h2
* Rodar o arquivo DemoApplication.java como springboot api
* Colar na pagina web:http://localhost:8080/h2-console
  * No campo JDB URL:jdbc:h2:mem:testdb
  * User Name: sa
  * Password:


### Running local
## Rodar o codigo DemoAplication com a API springboot.
## Rodar POSTMAN: Desenvolvido GET no Postman
# Para verificar produtos inserir:
* http://localhost:8080/Products/
* Verificar Produtos no formato JSON:
* [
    {
        "id": 1,
        "name": "Cama",
        "description": "Cama estilosa.",
        "price": 90.5,
        "imgUrl": "",
        "categories": []
    },
    {
        "id": 2,
        "name": "Telefone",
        "description": "Telefone antigo.",
        "price": 2190.0,
        "imgUrl": "",
        "categories": []
    },
    {
        "id": 3,
        "name": "Computador",
        "description": "Computador mediano.",
        "price": 1250.0,
        "imgUrl": "",
        "categories": []
    },
    {
        "id": 4,
        "name": "Refrigerador",
        "description": "Refrigerador duas portas.",
        "price": 1200.0,
        "imgUrl": "",
        "categories": []
    },
    {
        "id": 5,
        "name": "Mesa",
        "description": "Mesa de vidro.",
        "price": 100.99,
        "imgUrl": "",
        "categories": []
    }
* ]


##  Banco de dados H2
# Digitar na janela web: 
* http://localhost:8080/h2-console/
# Dados para acesso
* JDBC URL: jdbc:h2:mem:testdb
* Username: sa
* Password: 

# Verificar as tabelas:clicar em run
 * TB_CATEGORY:Dados de id e nome das categorias
 * TB_ORDER:Ordem dos produtos solicitados
 * TB_PRODUCT:produtos solicitados para compra
 * TB_PRODUCT_CATEGORY:relacao produto x categoria
 * TB_USER:dados dos usuarios como e-mail,name, password,phone

 ## PROXIMOS PASSOS PARA DESENVOLVIMENTO:
 # ALTERNAR PRODUCTS PARA PAIS
 # DESENVOLVER CRUD
 # DESENVOLVER POST
 # DESENVOLVER METODOS PARA AUTENTICAÇÃO




### Directory tree

* [infrastructure](./infrastructure) -> contains terraform projects
    * [cloud]
        * [**content**](./infrastructure/cloud)
    * [components]
        * [**content**](./infrastructure/components)
    * [local]
        * [**content**](./infrastructure/local)


### Frequently asked question

- If two+ git branches generate migrations from `master`, they can conflict?
    - They will. Alembic is simple, every migration are chained to the previous one,
      having two migrations pointing to the same `down_revision` is forbidden and will happens in this scenario
      If your change are not actually conflicting (they do not change the same table/column) when merging you can just fix the `chain`.
      Example: if `branch-A` and `branch-B` generate migrations from `master`
      when merging you will have to choose `master -> a -> b` or `master -> b -> a`.
      Don't freak out about it, any inconsistent migrations will not be applied and alembic will let you know.

**API Reading**
- [] Github api project. (https://github.com/JenniferFariasRodrigues/springboot-Java-11/tree/main/demo)

## Deploying

Exists two kinds of deployment in this project:





