
dependencies:
	- docker-compose up -d

run: dependencies
	- ./gradlew bootRun

test:
	- docker run -it --rm -v $(PWD)/src/gatling/conf:/opt/gatling/conf \
      -v $(PWD)/src/gatling/simulations:/opt/gatling/user-files/simulations \
      -v $(PWD)/src/gatling/results:/opt/gatling/results \
      denvazh/gatling