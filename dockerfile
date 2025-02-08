# Maven and Java 11
FROM maven:3.8.1-jdk-11

WORKDIR /selenium

RUN git clone https://github.com/mohan-balakrishnan/webdriver-leafhub /selenium

RUN git pull

CMD mvn clean test
