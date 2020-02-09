
dependencies:
	- docker-compose up -d postgres flyway

clean:
	- docker-compose down

run: dependencies
	- ./gradlew build && docker-compose up -d --force-recreate --build api

run-docker: dependencies
	- docker pull alexandreesl/gatling_lab
	- docker-compose up -d --no-build api

test: clean run
	- docker-compose up gatling

test-docker: clean run-docker
	- docker-compose up gatling