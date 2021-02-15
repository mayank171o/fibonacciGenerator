"# fibonacciGenerator" 

# To build and run the app , from base folder run
mvn package && java -jar target/demo-0.0.1-SNAPSHOT.jar
# To Build the Docker Image locally
docker build -t fibonacci/fibonacciseq-spring-boot-docker .
# To run the Docker image created locally
docker run -p 8080:8080 fibonacci/fibonacciseq-spring-boot-docker:latest
#Image uploaded to docker hub @
https://hub.docker.com/repository/docker/mayank1783/fibonacci-sequence
