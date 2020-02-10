
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

trait ReadOperationsSimulation {

  val leftLimit = 1L
  val rightLimit = 10L
  def generateLong = leftLimit + (Math.random * (rightLimit - leftLimit)).toLong

  val readScn = scenario("ReadScenario")
    .exec(http("request_get")
      .get("/" + generateLong))
    .pause(5)
    .exec(http("request_get_name")
      .get("/name/Alexandre"))
    .pause(5)


}