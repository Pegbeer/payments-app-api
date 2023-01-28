package com.pegbeer.paymentsappapi.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "payment")
data class Payment(
    @Id
    var id:String = "",
    var number:Int = 0,
    var name:String = "",
    var month:Int = 0,
    @get:JsonProperty("isPaid")
    var isPaid:Boolean = false
)