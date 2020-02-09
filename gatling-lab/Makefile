
dependencies:
	- docker-compose up -d postgres flyway

clean:
	- docker-compose down

run: dependencies
	- ./gradlew build && docker-compose up -d --force-recreate --build api

test: clean run
	- docker-compose up gatling