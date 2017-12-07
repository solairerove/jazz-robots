package com.github.solairerove.jazz.robots.domain.handler

import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult

/**
 * Task Configuration handler to provide submit task according to specific configuration.
 */
interface TaskConfigurationHandling {

    fun handle(appName: String?, configuration: ProlesTaskConfiguration): TaskResult
}
