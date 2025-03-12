# Etapa 1: Construção do artefato (imagem builder)
FROM maven:3.9.9-amazoncorretto-21 AS builder

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiar o código-fonte para o contêiner
COPY . .

# Construir o aplicativo (pode pular os testes com a opção -DskipTests)
RUN mvn clean package -DskipTests

# Etapa 2: Execução do aplicativo
FROM openjdk:21-slim

# Diretório de trabalho no contêiner
WORKDIR /app

# Copiar o JAR gerado da etapa de build
COPY --from=builder /app/target/*.jar app.jar

# Expor a porta que a aplicação vai rodar (geralmente 8080 para Spring Boot)
EXPOSE 8080

# Comando para rodar o aplicativo Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
