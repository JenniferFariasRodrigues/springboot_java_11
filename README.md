# Projeto web services com Spring Boot e JPA/Hibernate 

This project aims to be a building block for several lambdas and other services.s

## Development Requirements

Requirements:



## Development steps:

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções 

### Running tests



### Running local



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
- [1] Projeto web services com Spring Boot e JPA / Hibernate  [tutorial](file:///home/jennifer/Downloads/Projeto-web-services-Spring-Boot-JPA%20(1).pdf) for more
- [2] Github api project. (https://github.com/JenniferFariasRodrigues/springboot-Java-11/tree/main/demo)

## Deploying

Exists two kinds of deployment in this project:





