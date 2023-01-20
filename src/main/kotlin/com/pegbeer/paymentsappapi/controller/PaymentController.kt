package com.pegbeer.paymentsappapi.controller

import com.pegbeer.paymentsappapi.model.Payment
import com.pegbeer.paymentsappapi.model.Result
import com.pegbeer.paymentsappapi.service.PaymentService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PaymentController(private val paymentService: PaymentService) {


    @RequestMapping(value = ["/payments"], method = [RequestMethod.POST])
    fun createPayment(@RequestBody pay: Payment):Result<Payment>{
        val res = paymentService.createPayment(pay) ?: return Result.error("An error occurred trying to save the payment")
        return Result.success(res)
    }

    @RequestMapping(value = ["/payments"], method = [RequestMethod.GET])
    fun getPayments():List<Payment>{
        return paymentService.getPayments()
    }

    @RequestMapping(value = ["/payments"], method = [RequestMethod.PUT])
    fun updatePayment(@RequestBody payment: Payment):Payment{
        return paymentService.updatePayment(payment.id,payment)
    }

}