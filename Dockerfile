FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/*.jar hello-word.jar
ENTRYPOINT ["java", "-jar","/hello-world.jar", "&"]