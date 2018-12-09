FROM openjdk:8-jdk-slim
VOLUME /tmp
COPY build/libs/muscleman-0.0.1-SNAPSHOT.jar muscleman-0.0.1.jar
ADD src/main/resources/templates /store
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/muscleman-0.0.1.jar"]
