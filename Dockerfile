FROM openjdk:10-jdk-slim
VOLUME /tmp
ADD build/libs/muscleman-0.0.1-SNAPSHOT.jar muscleman-0.0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/muscleman-0.0.1.jar"]