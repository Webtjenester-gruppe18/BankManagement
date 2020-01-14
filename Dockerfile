FROM java:8
EXPOSE 8080
ADD /target/bankmanagement-0.0.1-SNAPSHOT.jar bankmanagement.jar
ENTRYPOINT ["java","-jar","bankmanagement.jar"]
