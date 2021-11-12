FROM openjdk:8-jdk-alpine
MAINTAINER Sesha_Dwi_Lestari <1941720173@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Tabung.java /java

# Compile file java
RUN javac Tabung.java

# Running java
ENTRYPOINT java Tabung