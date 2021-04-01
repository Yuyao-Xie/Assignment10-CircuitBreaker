package com.example

import io.micronaut.http.client.annotation.Client
import io.micronaut.retry.annotation.CircuitBreaker

@Client("service2")
@CircuitBreaker
interface Service2Client extends Service2{
}