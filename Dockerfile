FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-student-crud.jar spring-boot-student-crud.jar
ENTRYPOINT ["java","-jar","/spring-boot-student-crud.jar"]