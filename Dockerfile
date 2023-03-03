FROM java:8
WORKDIR /var/www/java
COPY . /var/www/java/
RUN javac JunitDemo.java
CMD ["java", ".src/main/java/org/example"]