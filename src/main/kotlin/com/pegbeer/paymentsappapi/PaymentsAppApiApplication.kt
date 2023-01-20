package com.pegbeer.paymentsappapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [DataSourceAutoConfiguration::class])
class PaymentsAppApiApplication

fun main(args: Array<String>) {
    runApplication<PaymentsAppApiApplication>(*args)
}