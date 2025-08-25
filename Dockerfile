
FROM amazoncorretto:21
COPY ./auth-service.jar .
ENTRYPOINT ["java","-jar","auth-service.jar"]
