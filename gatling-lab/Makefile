
dependencies:
	- docker-compose up -d postgres flyway

run: dependencies
	- ./gradlew build && docker-compose up -d api

test:
	- docker-compose up gatling