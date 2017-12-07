package com.github.solairerove.jazz.robots.domain.model.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction
import com.github.solairerove.jazz.robots.domain.task.executor.ProlesTaskExecutor
import com.github.solairerove.jazz.robots.domain.task.executor.TaskExecutor
import com.github.solairerove.jazz.robots.domain.task.handler.TaskConfigurationHandling

/**
 * Proles task configuration.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProlesTaskConfiguration : TaskConfiguration, AppConfiguration() {

    var prolesAction: ProlesAction? = null

    override fun appName() = appName

    override fun acceptSubmit(handler: TaskConfigurationHandling) = handler.handle(appName, this)

    override fun executorClass(): Class<out TaskExecutor> = ProlesTaskExecutor::class.java
}
