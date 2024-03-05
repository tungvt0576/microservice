FROM openjdk:17-slim-buster
ENV SPRING_PROFILE="dev"
RUN mkdir /app
RUN apt-get update && apt-get install -y fontconfig libfreetype6 && rm -rf /var/lib/apt/lists/*
RUN apt-get install tzdata && \
    ln -sf /usr/share/zoneinfo/Asia/Bangkok /etc/localtime && \
    echo "Asia/Bangkok" > /etc/timezone
COPY ./build/libs/demo-service-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app

ENTRYPOINT ["java","-Dspring.profiles.active=${SPRING_PROFILE}","-jar","app.jar"]

