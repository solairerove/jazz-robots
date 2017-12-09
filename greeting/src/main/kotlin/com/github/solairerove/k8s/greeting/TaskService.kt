package com.github.solairerove.k8s.greeting

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Task service with hystrix fallback methods.
 */
@Service
class TaskService(@Autowired val taskClient: TaskClient) {

    @HystrixCommand(fallbackMethod = "fetchFallTasks")
    fun fetchTasks() = taskClient.tasks()

    fun fetchFallTasks() = "Hello form Hystrix. Task service died"
}
