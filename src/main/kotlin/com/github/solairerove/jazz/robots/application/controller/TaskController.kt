package com.github.solairerove.jazz.robots.application.controller

import com.github.solairerove.jazz.robots.application.dto.TaskConfigurationRequest
import org.dozer.DozerBeanMapper
import org.slf4j.LoggerFactory
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
class TaskController(@Autowired val mapper: DozerBeanMapper) {

    private val logger = LoggerFactory.getLogger(TaskController::class.java)

    @PostMapping
    fun registerTask(@RequestBody requestConfiguration: TaskConfigurationRequest): ResponseEntity<*> {
        val taskConfiguration = mapper.map(requestConfiguration, requestConfiguration.configurationClass())

        // execute

        // task result

        logger.info("$taskConfiguration")

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(taskConfiguration)
    }
}
