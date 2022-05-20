FROM maven:3.8.5-openjdk-17 as maven
COPY . ./jenkins-test
WORKDIR ./jenkins-test
RUN mvn clean install

FROM openjdk:17-alpine
WORKDIR ./jenkins-docker-test
COPY --from=maven /jenkins-test/target/oauth2-1.0.jar ./
COPY --from=maven /jenkins-test/target/lib ./lib
COPY --from=maven /jenkins-test/src/etc/service.properties ./
CMD ["java","-jar", "./oauth2-1.0.jar"]