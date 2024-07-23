FROM openjdk:11-jdk-slim

EXPOSE 8761

ADD ./build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
