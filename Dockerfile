
FROM amazoncorretto:21
COPY ./app/build/libs/app.jar ./auth-service.jar
ENTRYPOINT ["java","-jar","auth-service.jar"]
