import io.gatling.core.Predef._
import io.gatling.http.Predef._

trait GatlingProtocol {

  val httpProtocol = http
    .baseUrl("http://api:8080/user")
    .acceptHeader("application/json")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) " +
      "Gecko/20100101 Firefox/31.0")

}