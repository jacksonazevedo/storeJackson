# Loja Jackson
Este projeto é um exemplo simples de um sistema de gerenciamento de produtos, utilizando Java Spring Boot para criar um CRUD (Create, Read, Update, Delete) de produtos.

Instalação
1. Clone o repositório para sua máquina local.
    ````
    git clone https://github.com/jacksonazevedo/storeJackson.git
    ````    
2. Abra o projeto em sua IDE Java de preferência (Eclipse, IntelliJ, etc.).
3. Configure o arquivo `application.properties` com as configurações do banco de dados utilizado no projeto.

    ````
    spring.datasource.url=jdbc:mariadb://localhost:3306/store
    spring.datasource.username=usuario-do-banco
    spring.datasource.password=senha-do-banco
    spring.jpa.hibernate.ddl-auto=update
    ````
4. Execute o projeto utilizando a sua IDE ou o comando mvn `spring-boot:run`.
5. Acesse o sistema através da URL `http://localhost:8080`.

## Funcionalidades
O sistema possui as seguintes funcionalidades:

* Cadastrar um novo produto.
* Listar todos os produtos cadastrados.
* Editar as informações de um produto existente.
* Excluir um produto existente.

| Método HTTP	| Endpoint | Descrição |
|--------|----------|----------|
| GET |	/produto |	Retorna todos os produtos cadastrados |
| GET |	/produto/{id} |	Retorna um produto específico pelo ID |
| POST |	/produto |	Cadastra um novo produto |
| PUT |	/produto/{id} |	Atualiza as informações de um produto existente |
| DELETE |	/produto/{id} |	Exclui um produto existente pelo ID |


## Tecnologias utilizadas

* Java 17
* Spring Boot 2.7.10
* MariaDB
* Maven
* Validations
* Swagger
* Lombok

## Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.
