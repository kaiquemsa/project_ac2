# Etapa 1: Definindo a imagem base do OpenJDK
FROM openjdk:17-jdk-slim as build

# Diretório de trabalho no contêiner
WORKDIR /app

# Copiar o arquivo JAR gerado para dentro do contêiner
COPY target/*.jar app.jar

# Expor a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
