package com.pegbeer.paymentsappapi.model

import kotlinx.serialization.Serializable

@Serializable
data class Result<out T>(val status: Status, val data: T?, val message: String?) {

    enum class Status {
        SUCCESS,
        ERROR
    }

    companion object {
        fun <T> success(data: T?): Result<T> {
            return Result(Status.SUCCESS, data, null)
        }

        fun <T> error(message:String): Result<T> {
            return Result(Status.ERROR, null, message)
        }

    }
}