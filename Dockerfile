FROM gradle:9.4.0-jdk17-alpine AS build
WORKDIR /app
COPY . .
run gradle build --no-daemon

FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/usuario.jar

EXPOSE 8081

CMD ["java", "-jar", "/app/usuario.jar"]