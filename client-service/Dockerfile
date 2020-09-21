FROM openjdk:14-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} client-service.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /client-service.jar"]
