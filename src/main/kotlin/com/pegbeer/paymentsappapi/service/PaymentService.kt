package com.pegbeer.paymentsappapi.service

import com.pegbeer.paymentsappapi.model.Payment
import com.pegbeer.paymentsappapi.repository.IPaymentRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PaymentService(private val repository: IPaymentRepository) {

    fun createPayment(pay: Payment): Payment? {
        var result:Payment?
        try {
            pay.apply {
                id = UUID.randomUUID().toString()
            }
            result = repository.save(pay)
        }catch (ex:Exception){
            result = null
        }
        return result
    }

    fun getPayments():List<Payment>?{
        val result:List<Payment>? = try {
            repository.findAll()
        }catch (ex:Exception){
            null
        }
        return result
    }

    fun updatePayment(id:String,pay:Payment):Payment{
        val payment = repository.findById(id).get()
        payment.apply {
            name = pay.name
            number = pay.number
            month = pay.month
            isPaid = pay.isPaid
        }
        return repository.save(payment)
    }

}