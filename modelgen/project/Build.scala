import sbt._
import Keys._
import de.johoop.jacoco4sbt._
import JacocoPlugin._

object ModelGenBuild extends Build {

  lazy val modelgen = Project("modelgen", file(".")) settings(parallelExecution in jacoco.Config := false) settings(jacoco.settings: _*)

}