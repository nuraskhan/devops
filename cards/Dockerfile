FROM openjdk:17-jdk-slim

MAINTAINER nuraskhan.com

RUN addgroup --system appgroup && adduser --system --ingroup appgroup appuser

WORKDIR /app
COPY target/cards-0.0.1-SNAPSHOT.jar app.jar
RUN chown -R appuser:appgroup /app

USER appuser

EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]