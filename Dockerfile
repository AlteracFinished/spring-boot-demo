FROM java:8-jre

ADD ./target/spring-boot-demo.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-boot-demo.jar"]

EXPOSE 8081