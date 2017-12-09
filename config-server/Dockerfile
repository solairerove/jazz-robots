FROM openjdk:8-alpine
MAINTAINER "Nikita Krivitski" <hax2033@gmail.com>
ADD ./target/config-server-0.0.1-SNAPSHOT.jar /config-server.jar
RUN sh -c 'touch /config-server.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/config-server.jar"]
