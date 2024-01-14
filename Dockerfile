FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/JD-REST-0.0.1-SNAPSHOT.jar RESTapp.jar

CMD ["java", "-jar", "app.jar"]