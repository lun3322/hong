FROM openjdk:11-jre
LABEL org.opencontainers.image.authors="lun3322@126.com"
WORKDIR /app
COPY start/target/hong-start.jar  /app/app.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "app.jar" , "--server.port=80"]
