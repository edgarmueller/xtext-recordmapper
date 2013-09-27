package de.cubereactor.modelgen.booking

import de.cubereactor.modelgen.model._
import de.cubereactor.modelgen.dsl.DSL._

object deploymentComp {

  import de.cubereactor.modelgen._
  import de.cubereactor.modelgen.booking.comp._

  val compAPI = "comp.api" -> "de.cubereactor.comp.api" is deployable += List(
    bookingRequest as api,
    bookingConf as api)

  val compModel = "comp.model" -> "de.cubereator.comp.model" is deployable += List(
    bookingRecord as mongo
      ("collection" -> "booking_record",
        "saveStrategy" -> "save"))

}