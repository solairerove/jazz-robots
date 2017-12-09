FROM openjdk:8-alpine
MAINTAINER "Nikita Krivitski" <hax2033@gmail.com>
ADD ./target/big-brother-0.0.1-SNAPSHOT.jar /big-brother.jar
RUN sh -c 'touch /big-brother.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/big-brother.jar"]
