package de.cubereactor.modelgen.booking

import de.cubereactor.modelgen.generator.GeneratorDriver
import de.cubereactor.modelgen.model._

object Main extends App {

  import de.cubereactor.modelgen.booking.deploymentCommon._
  import de.cubereactor.modelgen.booking.deploymentComp._

  val project = Project("test", List(commonAPI, commonModel, compAPI, compModel))

  val files = GeneratorDriver.generate(project)

  files foreach {
    file =>
      println("\nNEW FILE\n======\n")
      println(file)
  }

 
}