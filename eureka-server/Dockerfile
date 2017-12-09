FROM openjdk:8-alpine
MAINTAINER "Nikita Krivitski" <hax2033@gmail.com>
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /eureka-server.jar
RUN sh -c 'touch /eureka-server.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server.jar"]
