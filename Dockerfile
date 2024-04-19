FROM openjdk:21-jdk
WORKDIR /opt/app
COPY target/coba-0.0.1-SNAPSHOT.jar coba.jar
EXPOSE 8080
ENTRYPOINT exec java -jar coba.jar

