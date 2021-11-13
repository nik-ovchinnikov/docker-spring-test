FROM openjdk:11
COPY . .
RUN ./mvnw package
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "./target/library-0.0.1-SNAPSHOT.jar"]