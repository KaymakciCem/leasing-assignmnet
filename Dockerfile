FROM openjdk:17
ADD target/leasing-assignment-0.0.1-SNAPSHOT.jar leasing-assignment.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "leasing-assignment.jar"]