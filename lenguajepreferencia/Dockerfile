FROM openjdk:8-jdk-alpine
LABEL maintainer="pablo.romero.salinas@gmail.com"
WORKDIR /workspace
ADD target/*.jar app.jar

ENV userPoolId="us-east-2_AKZJM1972"
ENV awsregion="us-east-2"
ENV aws_Region_Cognito="us-east-2"
ENV host="rm5rwx3livrbhc.cc4qyrlf9twg.us-east-2.rds.amazonaws.com"
ENV port="3306"
ENV database="geoserviciosbd"
ENV clientId="3hti4opc15c970712kshflhp5u"
ENV username="root"
ENV password="12345678"


ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /workspace/app.jar
EXPOSE 8080