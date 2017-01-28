FROM java:openjdk-8u45-jdk
EXPOSE 8080
CMD java -jar SpringBootNext-0.0.1-SNAPSHOT.jar
ADD target/SpringBootNext-0.0.1-SNAPSHOT.jar .