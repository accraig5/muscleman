FROM openjdk:8-jdk-slim
VOLUME /tmp
ADD build/libs/muscleman-0.0.1-SNAPSHOT.jar muscleman-0.0.1.jar
RUN mkdir -p src/main/
ADD src/main/resources/ src/main/resources
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/muscleman-0.0.1.jar"]
