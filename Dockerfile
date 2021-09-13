# Build
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Package
FROM openjdk:12-alpine
COPY --from=build /home/app/target/hello-world-insight-0.1.0.jar /usr/local/lib/helloworld.jar
#EXPOSE 8088
ENTRYPOINT ["java","-jar","/usr/local/lib/helloworld.jar"]
