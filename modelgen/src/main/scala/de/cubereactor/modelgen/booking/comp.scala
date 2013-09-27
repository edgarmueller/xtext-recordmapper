package de.cubereactor.modelgen.booking

import de.cubereactor.modelgen.dsl.DSL._

object comp {
  
  import de.cubereactor.modelgen.booking.common._
   	
   val bookingRequest = "BookingRequest" is entity += List(
     "id" is string,
     "name" is string,
     "email" is string(
    	"validation" -> "email",
         "a" -> "b"), 
     "address" is ref(address))
   
  
  val bookingConf = "BookingConfirmation" is entity += List(
    "bookingNr" is int,
    "created" is datetime
  )
  
//  val bookingRecord = "BookingRecord" is entity += bookingConf  
  val bookingRecord = "BookingRecord" is entity += List(
    "name" is string,
    "email" is string,
    "address" is ref(address),
    "addressList" is list(address),
    "bookingNr" is int)
   
}