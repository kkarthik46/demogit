FROM openjdk:17-alpine
EXPOSE 8084
ADD target/SpringBootJPA-0.0.1-SNAPSHOT.war SpringBootJPA-0.0.1-SNAPSHOT.war
ENTRYPOINT [ "java","-jar","/SpringBootJPA-0.0.1-SNAPSHOT.war" ]