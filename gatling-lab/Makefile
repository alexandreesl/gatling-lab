
dependencies:
	- docker-compose up -d postgres flyway

run: dependencies
	- ./gradlew build && docker-compose up -d --force-recreate --build api

test:
	- docker-compose up gatling