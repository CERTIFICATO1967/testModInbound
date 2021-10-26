# It will be used openjdk 11
FROM openjdk:11-jdk-slim

USER root

RUN mkdir /etc/pki && \
    mkdir /etc/pki/ca-trust && \
    mkdir /etc/pki/ca-trust/source && \
    mkdir /etc/pki/ca-trust/source/anchors

COPY TI_Trust_Technologies_Private_CA.base64.cer /etc/pki/ca-trust/source/anchors/ 

RUN update-ca-certificates

RUN adduser --system -q --disabled-password trcs && \
    mkdir /trcs && \
    chown trcs /trcs 
USER trcs

WORKDIR /trcs

COPY ./trcs-kafka-inbound-adapter-1.0.0-SNAPSHOT.jar /trcs/lib/trcs-kafka-inbound-adapter.jar

EXPOSE 8080


VOLUME /logs
# VOLUME /trcs/logs
# VOLUME /trcs/var/log
# VOLUME /trcs/etc
# VOLUME /trcs/var/soap



# Set the startup command to execute the jar
CMD java -Xms1000m -Xmx1900m -jar /trcs/lib/trcs-kafka-inbound-adapter.jar

