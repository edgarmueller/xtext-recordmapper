package de.cubereactor.modelgen.generator

import java.util.Date
import ImportUtil.Importing
import ImportUtil.Imports
import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.generator.mongo._
import scala.collection.mutable.MutableList
import java.io.PrintWriter
import java.io.File

object GeneratorDriver {
  
  def generate(project: Project): Traversable[String] = {

    val imports = ImportUtil.imports(project)

    project.packages.map {
      pkg =>
        val writer = new Serializer 
        new DeploymentPackageGenerator(writer, imports).generate(pkg)
        writer.finish
    }
  }
  
   def generate(outputDir: String, project: Project): Traversable[String] = {

    val imports = ImportUtil.imports(project)

    project.packages.map {
      pkg =>
        val writer = new Serializer 
        new DeploymentPackageGenerator(writer, imports).generate(pkg)
        val result = writer.finish
        val printWriter = new PrintWriter(outputDir + File.separatorChar + pkg.path)
        printWriter.print(result)
        printWriter.close
        result
    }
  }
}

// -

class DeploymentPackageGenerator(val serializer: Serializer, imports: Imports)
	extends ParentGenerator[DeploymentPackage, Deployable] {

  def generate(input: DeploymentPackage) = {
    generateDP(input)
  }

  def deployableGen = new DeployableGenerator(serializer)
  def childGenerator = deployableGen

  def generateDP(deploymentPackage: DeploymentPackage) = {
    serializer addLn s"package ${deploymentPackage.name}"
    serializer.newLine

    // TODO: add option to compare serialized stringa
//    w comment "Last generated: " + new Date()
//    w.newLine

    imports(deploymentPackage) foreach { serializer addLn "import " + _ }
    serializer.newLine

    sepLoop(deploymentPackage.deployables, serializer.NL)
  }

  override def imports(_package: DeploymentPackage) = {
    _package.deployables.flatMap(deployableGen.imports(_).distinct).toList ++
      deployableGen.imports(_package, imports).distinct
  }
}

class DeployableGenerator(val serializer: Serializer) extends Generator[Deployable] with Importing[Deployable] {
  
  import de.cubereactor.modelgen.generator.api._


  def generate(input: Deployable) = {
    input match {
      case cc: CaseClass => new CaseClassGenerator(serializer).generate(cc.entity)
      case m: MongoRecord => new MongoRecordGenerator(serializer).generate(m.entity)
      case b: BsonRecord => new BSONRecordGenerator(serializer).generate(b.entity)
      case j: JSONMapping => new JSONMappingGenerator(serializer).generate(j.entity)
      case co: CompositeEntityRepresentation => new CompsiteEntityGenerator(serializer, co.representations:_*).generate(co.entity)
      case _ => println("No deployable generator matched")
    }
  }

  override def imports(input: Deployable) = {
    input match {
      case cc: CaseClass => new CaseClassGenerator(serializer).imports(cc.entity)
      case m: MongoRecord => new MongoRecordGenerator(serializer).imports(m.entity)
      case b: BsonRecord => new BSONRecordGenerator(serializer).imports(b.entity)
      case j: JSONMapping => new JSONMappingGenerator(serializer).imports(j.entity)
      case co: CompositeEntityRepresentation => new CompsiteEntityGenerator(serializer, co.representations:_*).imports(co.entity)
      case _ => List()
    }
  }

  def imports(_package: DeploymentPackage, imports: Imports): List[String] = {
    _package.deployables.toList.collect {

      case e: EntityRepresentation => collectEntities(e).flatMap(importsFor(_, e.getClass().getName, imports))

    }.flatten
  }

  def collectEntities(e: EntityRepresentation): List[Entity] = {
    e.entity.fields.toList.collect {
      case Field(_, ObjectRefType(entity)) => entity
      case Field(_, ListType(ObjectRefType(entity))) => entity
    }
  }

  def importsFor(entity: Entity, importType: String, global: Imports): Option[String] = {
    global.get(importType).flatMap(_.get(entity).map(_.path))
  }
}


class CompsiteEntityGenerator (val serializer: Serializer, val representations: EntityRepresentation*) extends Generator[Entity] {
  
  import de.cubereactor.modelgen.generator.api._


  def generate(input: Entity) = {
	  for (r <- representations) {
	    r match {
	      case c: CaseClass => new CaseClassGenerator(serializer).generate(c.entity)
          case m: MongoRecord => new MongoRecordGenerator(serializer).generate(m.entity)
          case b: BsonRecord => new BSONRecordGenerator(serializer).generate(b.entity)
          case j: JSONMapping => new JSONMappingGenerator(serializer).generate(j.entity)
	    }
	  }
  }

  override def imports(input: Entity) = {
     representations.toList.flatMap(r => r match {
	      case c: CaseClass => new CaseClassGenerator(serializer).imports(c.entity)
          case m: MongoRecord => new MongoRecordGenerator(serializer).imports(m.entity)
          case b: BsonRecord => new BSONRecordGenerator(serializer).imports(b.entity)
          case j: JSONMapping => new JSONMappingGenerator(serializer).imports(j.entity)
	 })
  }
}

