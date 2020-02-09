FROM openjdk:11-jdk-slim
WORKDIR /opt/app/
ADD build/libs/gatling-lab-*.jar api.jar
RUN sh -c 'touch api.jar'
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar api.jar