FROM maven:3-eclipse-temurin-17-alpine
WORKDIR /usr/app
COPY ./src /usr/app/src
COPY ./pom.xml /usr/app/pom.xml
CMD ["mvn", "spring-boot:run"]