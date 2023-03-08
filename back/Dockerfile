FROM openjdk:19 AS builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN microdnf install findutils
<<<<<<< HEAD
=======
RUN sed -i -e 's/\r$//' gradlew
>>>>>>> 07269bc1dadf60a9e760e5f8dfc1da635e5e9f58
RUN chmod +x ./gradlew
RUN ./gradlew bootJAR

FROM openjdk:19
COPY --from=builder build/libs/*.jar app.jar
EXPOSE 5050
ENTRYPOINT ["java", "-jar", "/app.jar"]
