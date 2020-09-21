FROM openjdk:14-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} discovery-service.jar
EXPOSE 8761
ENTRYPOINT ["sh", "-c", "java -jar /discovery-service.jar"]
