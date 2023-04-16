FROM eclipse-temurin:17-jre-alpine
WORKDIR /usr/app
COPY ./target/springtest-0.0.1-SNAPSHOT.jar /usr/app/springtest-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "/usr/app/springtest-0.0.1-SNAPSHOT.jar"]