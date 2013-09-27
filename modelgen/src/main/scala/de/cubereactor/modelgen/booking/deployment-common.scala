package de.cubereactor.modelgen.booking

import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.dsl.DSL._

object deploymentCommon {
  
  import de.cubereactor.modelgen.booking.common._
  
  val commonAPI = "common.api" -> "de.cubereactor.common.api" is deployable += List(
		  address as api
	  ) 
  
  val commonModel = "common.model" -> "de.cubereactor.common.model" is deployable += List(
		  address as mongo(
				  "collection" -> "addressColl"
		  )
      )
        
}