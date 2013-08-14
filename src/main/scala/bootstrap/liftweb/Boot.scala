package bootstrap.liftweb

import net.liftweb._
import net.liftweb.http._

class Boot {
  def boot {
    // where to search snippet
    LiftRules.addToPackages("code")
  }
}
