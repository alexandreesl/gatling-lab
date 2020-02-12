
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class SimulationRunner extends Simulation with CrudSimulation with ReadOperationsSimulation with WriteOperationsSimulation with GatlingProtocol {

  setUp(
    crudScn.inject(atOnceUsers(1)),
    readScn.inject(constantUsersPerSec(250) during (5 minutes)),
    writeScn.inject(rampUsers(600) during (2 minutes))
  ).protocols(httpProtocol)


}