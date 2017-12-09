package com.github.solairerove.jazz.robots

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class JazzRobotsApplication

fun main(args: Array<String>) {
    SpringApplication.run(JazzRobotsApplication::class.java, *args)
}
