FROM openjdk:11.0.12-jre-nanoserver
VOLUME /tmp
COPY target/users-ws-0.1.jar users-service.jar
ENTRYPOINT ["java",
"-Djava.security.egd=file:/dev/./urandom",
"-jar",
"users-service.jar"]