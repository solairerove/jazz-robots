package com.github.solairerove.jazz.robots.application.controller

import com.github.solairerove.jazz.robots.application.auditing.Audit
import com.github.solairerove.jazz.robots.application.dto.config.TaskConfigurationRequest
import com.github.solairerove.jazz.robots.application.dto.task.TaskResultWithConfigResponse
import com.github.solairerove.jazz.robots.domain.task.TaskManagement
import org.dozer.DozerBeanMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Task manager controller.
 */
@RestController
@RequestMapping(value = "/api/v1/tasks")
class TaskController(
        @Autowired val taskManagement: TaskManagement,
        @Autowired val mapper: DozerBeanMapper) {

    @Audit
    @PostMapping
    fun registerTask(@RequestBody requestConfiguration: TaskConfigurationRequest): ResponseEntity<*> {
        val taskConfiguration = mapper.map(requestConfiguration, requestConfiguration.configurationClass())

        val taskResult = taskManagement.executeTask(taskConfiguration)

        val response = mapper.map(taskResult, TaskResultWithConfigResponse::class.java)

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(response)
    }
}
