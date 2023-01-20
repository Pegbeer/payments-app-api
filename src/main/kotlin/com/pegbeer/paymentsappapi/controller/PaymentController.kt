package com.pegbeer.paymentsappapi.controller

import com.pegbeer.paymentsappapi.model.Payment
import com.pegbeer.paymentsappapi.service.PaymentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PaymentController {


    @Autowired
    lateinit var paymentService: PaymentService

    @RequestMapping(value = ["/payments"], method = [RequestMethod.POST])
    fun createPayment(@RequestBody pay: Payment):Payment{
        return paymentService.createPayment(pay)
    }

    @RequestMapping(value = ["/payments"], method = [RequestMethod.GET])
    fun getPayments():List<Payment>{
        return paymentService.getPayments()
    }

}