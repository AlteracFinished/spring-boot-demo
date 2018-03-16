FROM java:8-jre

VOLUME /log/spring-boot-demo /log
ADD ./target/spring-boot-demo.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/spring-boot-demo.jar"]

EXPOSE 8081