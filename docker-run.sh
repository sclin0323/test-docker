git pull origin master
mvn clean package docker:build
docker stop test-docker
docker rm test-docker
docker run -d --name test-docker -p 8080:8080 dockertest/test-docker
