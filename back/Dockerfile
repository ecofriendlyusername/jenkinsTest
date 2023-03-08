FROM openjdk:19 AS builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN microdnf install findutils
RUN sed -i -e 's/\r$//' gradlew
RUN chmod +x ./gradlew
RUN ./gradlew bootJAR

FROM openjdk:19
COPY --from=builder build/libs/*.jar app.jar
EXPOSE 5050
ENTRYPOINT ["java", "-jar", "/app.jar"]
