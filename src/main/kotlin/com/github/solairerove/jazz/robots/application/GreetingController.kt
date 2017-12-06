package com.github.solairerove.jazz.robots.application

import com.github.solairerove.jazz.robots.domain.model.greeting.Greeting
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger

@RestController
class GreetingController {

    private val id = AtomicInteger()

    @ResponseStatus(value = OK)
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "Mikita") name: String,
                 @RequestParam(value = "message", defaultValue = "Hello") message: String): Greeting =
            Greeting(name, message, id.incrementAndGet())
}
