package com.sanchez.turbinestream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream

@SpringBootApplication(exclude = [RabbitAutoConfiguration::class])
@EnableTurbineStream
class TurbineStreamApplication

fun main(args: Array<String>) {
    runApplication<TurbineStreamApplication>(*args)
}
