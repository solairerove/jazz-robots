package com.github.solairerove.jazz.robots.domain.model.configuration

import com.github.solairerove.jazz.robots.domain.handler.TaskConfigurationHandling
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult

/**
 * Task configuration to execute.
 */
interface TaskConfiguration {

    fun appName(): String?

    fun acceptSubmit(handler: TaskConfigurationHandling): TaskResult
}
