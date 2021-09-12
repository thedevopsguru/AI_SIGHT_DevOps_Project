FROM openjdk:11
RUN mkdir /usr/src/ai-insight-app
COPY . /usr/src/ai-insight-app
WORKDIR /usr/src/ai-insight-app
RUN javac HelloWorld.java
CMD ["java", "Main"]
