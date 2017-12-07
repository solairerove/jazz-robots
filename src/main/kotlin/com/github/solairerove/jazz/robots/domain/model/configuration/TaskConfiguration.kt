package com.github.solairerove.jazz.robots.domain.model.configuration

import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import com.github.solairerove.jazz.robots.domain.task.executor.TaskExecutor
import com.github.solairerove.jazz.robots.domain.task.handler.TaskConfigurationHandling

/**
 * Task configuration to execute.
 */
interface TaskConfiguration {

    fun appName(): String?

    fun acceptSubmit(handler: TaskConfigurationHandling): TaskResult

    fun executorClass(): Class<out TaskExecutor>
}
