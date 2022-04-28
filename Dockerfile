FROM openjdk:11
COPY ./ /app
WORKDIR /app
CMD ["java","-jar","target/serving-web-content-0.0.1-SNAPSHOT.jar"]


