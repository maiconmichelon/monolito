FROM java:8
MAINTAINER Maicon Michelon
COPY ./target /var/www
WORKDIR /var/www
ENTRYPOINT java -jar monolito-0.0.1-SNAPSHOT.jar
