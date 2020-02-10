
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class SimulationRunner extends Simulation with CrudSimulation with ReadOperationsSimulation with GatlingProtocol {

  setUp(
    crudScn.inject(atOnceUsers(1)),
    readScn.inject(constantUsersPerSec(50) during(3 minutes))
  ).protocols(httpProtocol)

}