package com.pegbeer.paymentsappapi.model

import kotlinx.serialization.Serializable
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Serializable
@Document(collection = "payment")
data class Payment(
    @Id
    var id:String = "",
    var number:Int = 0,
    var name:String = "",
    var month:Int = 0,
    var isPaid:Boolean = false
)
