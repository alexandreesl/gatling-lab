
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class CrudSimulation extends Simulation {

  val httpProtocol = http // 1
    .baseUrl("http://api:8080/user") // 2
    .acceptHeader("application/json") // 3
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0") // 4

  val scn = scenario("CrudSimulation") // 5
    .exec(http("request_get") // 6
    .get("/1")) // 7
    .pause(5) // 8
    .exec(http("request_post")
    .post("/")
    .body(StringBody("""{ "name": "MytestDummy", "phone":11938284334 }""")).asJson)
    .pause(5)


  setUp( // 9
    scn.inject(atOnceUsers(1)) // 10
  ).protocols(httpProtocol) // 11
}