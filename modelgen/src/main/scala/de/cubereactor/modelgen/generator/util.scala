package de.cubereactor.modelgen.generator

import de.cubereactor.modelgen.model._

class Serializer {
  
  val NL = sys.props("line.separator")
  val writer = new StringBuffer
  
  def add(str: String): Serializer = { writer.append(str); this }
  def addLn(str: String): Serializer = { writer.append(str + NL); this }
  def newLines(count: Int): Serializer = { (1 to count) foreach (i => add(NL)); this }
  def newLine: Serializer = { newLines(1); this }
  def comment(str: String): Serializer = { addLn("// " + str); this }
  def blockComment(str: String): Serializer = {
    addLn("/**")
    addLn(s" * $str")
    addLn(" */")
    this
  }
  def finish = writer toString
}

object ImportUtil {

  trait Importing[A] {

    def getImports(_package: DeploymentPackage, impots: Imports): List[String] = List("first.import", "second.import")

  }

  type Imports = Map[String, Map[Entity, DeploymentPackage]]

  def imports(project: Project): Imports = {
    project.packages.map {
      pack =>
        pack.deployables.collect {
          case e: EntityRepresentation => e.getClass.getName -> (e.entity -> pack)
        }
    }.flatten.groupBy(_._1).mapValues(t => t.map(_._2).toMap)
  }

}