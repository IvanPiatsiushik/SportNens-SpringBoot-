FROM adoptopenjdk/openjdk11
#WORKDIR /app
#COPY ./ /app
COPY /target/serving-web-content-0.0.1-SNAPSHOT.jar noty.jar
CMD ["java","-jar","noty.jar"]

