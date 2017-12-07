package com.github.solairerove.jazz.robots.domain.handler

import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.exception.ValueNotAllowedException
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import org.springframework.stereotype.Service

/**
 * Task Configuration handler.
 */
@Service
class TaskConfigurationHandler : TaskConfigurationHandling {

    override fun handle(appName: String?, configuration: ProlesTaskConfiguration): TaskResult {
        if (configuration.prolesAction == null) {
            throw ValueNotAllowedException("Dashboard can't be empty")
        }

        // results
        return TaskResult()
    }

    // handle
}