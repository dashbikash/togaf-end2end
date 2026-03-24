FROM  gradle:jdk25-alpine AS builder
WORKDIR /app
COPY . .
RUN gradle clean build

FROM  eclipse-temurin:25-alpine-3.23 AS product-service
WORKDIR /app
COPY  --from=builder /app/product_service/build/libs/product-service.jar app.jar
EXPOSE 8601
CMD ["java", "-jar", "app.jar"]

FROM  eclipse-temurin:25-alpine-3.23 AS customer-service
WORKDIR /app
COPY  --from=builder /app/customer_service/build/libs/customer_service.jar app.jar
EXPOSE 8602
CMD ["java", "-jar", "app.jar"]