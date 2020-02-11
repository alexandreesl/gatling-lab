
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

trait ReadOperationsSimulation extends NumberUtils {

  val readScn = scenario("ReadScenario")
    .exec(http("request_get")
      .get("/" + generateLong))
    .pause(5)
    .exec(http("request_get_name")
      .get("/name/Alexandre"))
    .pause(5)


}