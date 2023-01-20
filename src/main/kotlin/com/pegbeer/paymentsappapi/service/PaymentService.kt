package com.pegbeer.paymentsappapi.service

import com.pegbeer.paymentsappapi.model.Payment
import com.pegbeer.paymentsappapi.repository.PaymentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PaymentService {

    @Autowired
    lateinit var repository: PaymentRepository


    fun createPayment(pay:Payment): Payment {
        pay.apply {
            id = UUID.randomUUID().toString()
        }
        return repository.save(pay)
    }

    fun getPayments():List<Payment>{
        return repository.findAll()
    }

    fun deletePayment(id:String){
        repository.deleteById(id)
    }

    fun updatePayment(id:String,pay:Payment):Payment{
        val payment = repository.findById(id).get()
        payment.apply {
            name = pay.name
            number = pay.number
            month = pay.month
        }
        return repository.save(payment)
    }

}