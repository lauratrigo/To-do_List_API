# 📝 To-Do List API

Esta é uma API para gerenciar tarefas (**CRUD**) desenvolvida com **Spring Boot**, **Spring MVC**, **Spring Data JPA** e **MySQL**. O projeto foi criado como parte de um desafio para desenvolvedores backend júnior, com foco em boas práticas de programação e uso de tecnologias modernas.

## 🛠 Tecnologias Usadas

- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **SpringDoc OpenAPI 3**
- **MySQL**

![Spring Boot Badge](https://img.shields.io/badge/Spring_Boot-3.1.5-green?logo=spring&logoColor=white)
![Spring MVC Badge](https://img.shields.io/badge/Spring_MVC-6.0-green?logo=spring&logoColor=white)
![Spring Data JPA Badge](https://img.shields.io/badge/Spring_Data_JPA-3.1.5-green?logo=spring&logoColor=white)
![SpringDoc OpenAPI 3 Badge](https://img.shields.io/badge/SpringDoc_OpenAPI_3-2.2.0-blue?logo=swagger&logoColor=white)
![MySQL Badge](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql&logoColor=white)

## 💡 Objetivo

O objetivo deste projeto é implementar uma **API RESTful** para gerenciar tarefas, permitindo operações **CRUD** (Criar, Ler, Atualizar e Deletar). A API foi desenvolvida com foco em boas práticas como **SOLID**, **DRY**, **YAGNI** e **KISS**, além de utilizar **Spring Data JPA** para consultas ao banco de dados e **SpringDoc OpenAPI 3** para documentação automática das rotas.

## 🚀 Funcionalidades

- **POST /todos**: Cria uma nova tarefa.
- **GET /todos**: Lista todas as tarefas.
- **PUT /todos/{id}**: Atualiza uma tarefa existente.
- **DELETE /todos/{id}**: Remove uma tarefa.

## 📋 Pré-Requisitos

Antes de rodar a aplicação, certifique-se de ter os seguintes itens instalados:

- [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/)
- [Maven](https://maven.apache.org/download.cgi)

## 📦 Como Executar o Projeto

### Passo 1: Clone o repositório

```bash
git clone https://github.com/seu-usuario/todo-list-api.git
cd todo-list-api
```

### Passo 2: Configure o banco de dados

- Crie um banco de dados MySQL chamado todo_list.
- Configure as credenciais do banco de dados no arquivo application.properties:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/todo_list
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Passo 3: Construa o projeto

- Execute o seguinte comando para construir o projeto:

```bash
./mvnw clean package
```

### Passo 4: Execute a aplicação

```bash
java -jar target/todolist-0.0.1-SNAPSHOT.jar
```
A API estará disponível em http://localhost:8080.

### Passo 5: Acesse o Swagger

- Para explorar e testar as rotas da API, acesse o Swagger em:

```bash
[java -jar target/todolist-0.0.1-SNAPSHOT.jar](http://localhost:8080/swagger-ui.html)
```

## 📂 Estrutura do Projeto

```
todo-list-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── exemplo/
│   │   │           ├── controller/
│   │   │           │   └── TodoController.java
│   │   │           ├── model/
│   │   │           │   └── Todo.java
│   │   │           ├── repository/
│   │   │           │   └── TodoRepository.java
│   │   │           ├── service/
│   │   │           │   └── TodoService.java
│   │   │           └── DesafioTodoListApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   └── test/ 
├── target/ 
├── pom.xml
├── README.md
└── .gitignore
```
## Como Usar a API

### Criar Tarefa
```bash
http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1
```

### Listar Tarefas
```bash
http GET :8080/todos
```

### Atualizar Tarefa
```bash
http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2
```

### Remover Tarefa
```bash
http DELETE :8080/todos/1
```

## Como usar:
1. Copie o trecho acima.
2. Cole no seu arquivo `README.md` no GitHub.
3. Pronto! O Markdown já está formatado corretamente, e os blocos de código serão exibidos como esperado. 😊

## 🤝 Agradecimentos

Este projeto foi desenvolvido como parte de um desafio para desenvolvedores backend júnior, com base em um vídeo do YouTube. O objetivo principal foi praticar o uso de Spring Boot, Spring Data JPA e MySQL em uma API RESTful.

Caso deseje contribuir, fique à vontade! Para sugestões e melhorias, você pode fazer um fork do repositório, criar uma branch com suas mudanças e enviar um pull request.

## 📜 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

## 🎥 Créditos

Este projeto foi desenvolvido por Laura Trigo com base no vídeo [Desafio Vagas: API de tarefas com Spring Boot!](https://www.youtube.com/watch?v=IjProDV001o&list=PLdP0_O7ZLFU1ze1Lkg1aE8AilZ-_B2JOG&index=32).


