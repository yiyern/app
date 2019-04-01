FROM openjdk:8u212-jdk-slim

RUN groupadd -r -g 1000 appuser
RUN useradd -r -u 1000 -g 1000 -d /home/app appuser
USER appuser
