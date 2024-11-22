FROM openjdk:11
EXPOSE 8080
ADD target/guru.jar guru.jar
ENTRYPOINT ["java","-jar","/guru.jar"]