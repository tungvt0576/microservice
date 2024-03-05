FROM openjdk:17-slim-buster

RUN mkdir /app
RUN apt-get install tzdata && \
    ln -sf /usr/share/zoneinfo/Asia/Bangkok /etc/localtime && \
    echo "Asia/Bangkok" > /etc/timezone
COPY ./build/libs/api-gateway-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

ENTRYPOINT ["java","-jar","app.jar"]

