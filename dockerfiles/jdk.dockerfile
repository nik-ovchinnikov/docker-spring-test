FROM openjdk:11
#COPY ../target/library-0.0.1-SNAPSHOT.jar server.jar
#WORKDIR /app
#RUN cd app
# mvnw package
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app/target/library-0.0.1-SNAPSHOT.jar"]
#ENTRYPOINT ["mvn", "clean", "package"]
