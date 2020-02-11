
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

trait WriteOperationsSimulation extends NumberUtils {

  val writeScn = scenario("WriteScenario")
    .exec(http("request_post")
    .post("/")
    .body(StringBody(
      """{ "name": "MytestDummy",
        | "phone":11938284334 }""".stripMargin)).asJson)
    .pause(5)
    .exec(http("request_patch")
      .patch("/")
      .body(StringBody(
        s"""{ "id":$generateLong, "name": "MytestDummy$generateLong",
          |"phone":11938284123 }""".stripMargin)).asJson)

}