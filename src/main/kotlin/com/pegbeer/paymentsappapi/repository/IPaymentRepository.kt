package com.pegbeer.paymentsappapi.repository

import com.pegbeer.paymentsappapi.model.Payment
import org.springframework.data.mongodb.repository.MongoRepository

interface IPaymentRepository : MongoRepository<Payment,String>{


}