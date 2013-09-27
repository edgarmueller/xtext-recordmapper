package de.cubereactor.modelgen.generator

import de.cubereactor.modelgen.model.HasChildren
import de.cubereactor.modelgen.model.Entity
import de.cubereactor.modelgen.model.Field
import de.cubereactor.modelgen.model.Enum
import de.cubereactor.modelgen.model.EntityRepresentation

trait Generator[A] {
  
  def serializer: Serializer
  
  def generate(input: A)
  
  def imports(input: A): List[String] = List()
  
  implicit def generator: Generator[A] = this 
}

trait CompositeGenerator[A] extends Generator[A] {
  def childGenerators: List[Generator[A]]
}

trait HasChildGenerator[PARENT <: HasChildren[CHILD], CHILD] extends Generator[PARENT] {

	def childGenerator: Generator[CHILD] 

	def loop(inputs: Traversable[CHILD]) = inputs foreach childGenerator.generate

	def sepLoop(inputs: Traversable[CHILD], seperator: String) = {
		if (inputs.size > 1) {
			inputs.init.foreach { i => childGenerator.generate(i); serializer.addLn(seperator) }
		}
		if (inputs.size > 0) {
			childGenerator.generate(inputs.last)
		}
		serializer.newLine
	}

	override def imports(input: PARENT): List[String] = {
	  input.children flatMap { childGenerator.imports _}
	}
}

trait ParentGenerator[PARENT <: HasChildren[CHILD], CHILD] extends HasChildGenerator[PARENT,CHILD]
abstract class ChildGenerator[CHILD](parentGenerator: ParentGenerator[_,_]) extends Generator[CHILD] {
	def serializer = parentGenerator.serializer  
}

trait EntityGenerator extends ParentGenerator[Entity, Field]
abstract class FieldGenerator(parentGenerator: EntityGenerator) extends ChildGenerator[Field](parentGenerator)

trait EnumGenerator extends Generator[Enum]