FROM java:8

WORKDIR /wambugu-grocery

COPY target/product-0.0.1-SNAPSHOT.jar product-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "product-0.0.1-SNAPSHOT.jar"]

EXPOSE 9090