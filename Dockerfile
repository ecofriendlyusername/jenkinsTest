FROM openjdk:19 AS builder

COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

RUN microdnf install findutils

RUN chmod +x ./gradlew
# RUN ./gradlew bootJAR
RUN dos2unix NAME-OF-FILE.sh

FROM openjdk:19
COPY --from=builder build/libs/*.jar app.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/app.jar"]
