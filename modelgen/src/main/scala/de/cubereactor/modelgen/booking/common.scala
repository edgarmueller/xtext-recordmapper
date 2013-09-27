package de.cubereactor.modelgen.booking

import de.cubereactor.modelgen.dsl.DSL._

object common {
  
  val weekday = "WeekDay" is enum("mon", "tue", "wed") 

  val address = "Address" is entity
  
  val s = "street" is string
  address += s 
  address += "city" is string
  
  val foo = "Foo" is entity += 
    "foo" is string +=
    "AA" is string += 
    "Day" is enum(weekday)
    
  foo += List( 
    "foo2" is string,
    "AAA" is string)
  
  address += foo
  
  println(address.fields)
  
}