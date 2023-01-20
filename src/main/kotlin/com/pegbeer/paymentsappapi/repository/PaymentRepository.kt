package com.pegbeer.paymentsappapi.repository

import com.pegbeer.paymentsappapi.model.Payment
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepository : MongoRepository<Payment,String> {
}