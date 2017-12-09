package com.github.solairerove.k8s.greeting

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.util.concurrent.atomic.AtomicLong

/**
 * Greeting rest controller.
 */
@RestController
@RefreshScope
class GreetingController(
        @Autowired val restTemplate: RestTemplate,
        @Autowired val taskService: TaskService) {

    @Value("\${profile}")
    var profile: String? = null

    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam("name", defaultValue = "World") name: String): Greeting? =
            Greeting(counter.incrementAndGet(), "Hello, $name. Ur profile is $profile")

    @GetMapping("/tasks")
    fun tasks(@RequestParam("service", defaultValue = "task") service: String): String =
            restTemplate.getForObject("http://$service/tasks", String::class.java)

    @GetMapping("feign")
    fun taskFeign(): String = taskService.fetchTasks()
}
