FROM vertx/vertx4
ARG DEBIAN_FRONTEND=noninteractive

ENV VERTICLE_NAME tupper_soccer.tupper_soccer.MainVerticle
ENV VERTICLE_FILE target/tupper-soccer-1.0.0-SNAPSHOT.jar

ENV VERTICLE_HOME /usr/verticles

EXPOSE 8080

COPY $VERTICLE_FILE $VERTICLE_HOME/

#RUN apt-get install -y openjdk-11-jdk --fix-missing && java -version

#RUN apt-get update --allow-releaseinfo-change && apt-get upgrade -y && \
#    apt-get install -y openjdk-11-jdk

WORKDIR $VERTICLE_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec vertx run $VERTICLE_NAME -cp $VERTICLE_HOME/*"]
