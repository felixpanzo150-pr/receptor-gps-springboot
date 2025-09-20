# receptor-gps-springboot

Projeto desenvolvido em Java utilizando Spring Boot para gerenciar pontos de interesse (POI) via API RESTful.

## Funcionalidades
- Cadastro de pontos de interesse
- Listagem de pontos de interesse
- Persistência de dados com JPA/Hibernate
- Estrutura MVC (Model, View, Controller)
- Utilização de DTOs para transferência de dados
- Testes automatizados

## Estrutura do Projeto
```
src/
  main/
    java/
      tech/
        felixpanzo/
          poi/
            PoiApplication.java
            controller/
              PointOfInterestController.java
              dto/
                CreatePointOfInterest.java
            entity/
              PointOfInterest.java
            repository/
              PointOfInterestRepository.java
    resources/
      application.properties
      static/
      templates/
  test/
    java/
      tech/
        felixpanzo/
          poi/
            PoiApplicationTests.java
```

## Tecnologias Utilizadas
- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database (ou outro banco relacional)
- JUnit para testes

## Como executar
1. Clone o repositório:
   ```bash
   git clone https://github.com/felixpanzo150-pr/receptor-gps-springboot.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd receptor-gps-springboot
   ```
3. Execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse a API em `http://localhost:8080`

## Endpoints principais
- `POST /poi` - Cadastra um novo ponto de interesse
- `GET /poi` - Lista todos os pontos de interesse

## Testes
Para rodar os testes automatizados:
```bash
./mvnw test
```

## Configuração
As configurações do projeto estão no arquivo `src/main/resources/application.properties`.

## Autor
Felix Panzo

## Licença
Este projeto está sob a licença MIT.
