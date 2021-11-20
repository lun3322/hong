FROM openjdk:11-jre
LABEL org.opencontainers.image.authors="lun3322@126.com"
ARG version=v1
ENV APP_VERSION=$version
WORKDIR /app
COPY start/target/hong-start.jar  /app/app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "app.jar" , "--server.port=80"]
