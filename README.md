#  Library API

API REST em Java (Spring Boot 3.4.2) que emula um sistema de consulta de biblioteca.

##  Sobre o Projeto

Esta API permite gerenciar livros em uma biblioteca, oferecendo funcionalidades como:

- Cadastro de livros (em breve)
- Consulta de livros (pronto)
- Atualização de informações do livro (em breve)
- Remoção de livros (em breve)

###  Estrutura da Tabela (PostgreSQL)

```sql
CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    author_name VARCHAR(255) NOT NULL,
    number_of_pages BIGINT,
    book_genre VARCHAR(100),
    status_borrowed BOOLEAN DEFAULT FALSE,
    book_edition BIGINT,
    book_year BIGINT
);
```

##  Tecnologias Utilizadas

- Java 21  
- Spring Boot 3.4.2  
- PostgreSQL  
- Maven  
- Lombok  

## Configurar Banco de Dados

No arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://container_postgres:5432/library_api
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

Preste atenção no nome do ```container_postgres```!

### Executando o Projeto

1. Clone o repositório:
```
git clone https://github.com/seu-usuario/library-api.git
cd library-api
```
2. Agora compile a aplicação:
```
mvn spring-boot:run
```
- A aplicação estará disponível em ```http://localhost:8080```
- Endpoints ```GET``` disponíveis: ```/books```.

### Observação
- Este projeto foi criado para auxiliar no ensino de docker para alunos de **Ciência da Computação** e **Tecnologia da Informação** da **UFRN** na **Escola de Verão** do **PET-CC** de 2025.
