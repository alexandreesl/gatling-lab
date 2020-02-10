
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

trait CrudSimulation {

  val crudScn = scenario("CrudScenario")
    .exec(http("request_get")
      .get("/1"))
    .pause(5)
    .exec(http("request_post")
      .post("/")
      .body(StringBody(
        """{ "name": "MytestDummy",
          | "phone":11938284334 }""".stripMargin)).asJson)
    .pause(5)
    .exec(http("request_patch")
      .patch("/")
      .body(StringBody(
        """{ "id":11, "name": "MytestDummy2",
          |"phone":11938284123 }""".stripMargin)).asJson)
    .pause(5)
    .exec(http("request_get_name")
      .get("/name/MytestDummy"))
    .pause(5)
    .exec(http("request_delete")
      .delete("/11"))
    .pause(5)


}