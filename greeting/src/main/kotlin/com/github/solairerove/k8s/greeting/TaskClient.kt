package com.github.solairerove.k8s.greeting

import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("big-brother")
interface TaskClient {

    @GetMapping("api/v1/tasks")
    fun tasks(): String
}
