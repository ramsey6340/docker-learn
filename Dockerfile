# Étape 1 : Build du JAR avec Maven dans Docker
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B # Pour pouvoir utliser le cache
COPY src ./src
RUN mvn clean package -DskipTests

# Étape 2 : Image finale avec uniquement le JAR
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
