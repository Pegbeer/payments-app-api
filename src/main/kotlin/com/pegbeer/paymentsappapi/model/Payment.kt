package com.pegbeer.paymentsappapi.model

import kotlinx.serialization.Serializable
import org.springframework.data.annotation.Id


@Serializable
data class Payment(
    @Id
    var id:String = "",
    var number:Int = 0,
    var name:String = "",
    var month:String = ""
)
