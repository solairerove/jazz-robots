package com.github.solairerove.jazz.robots.domain.model.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.github.solairerove.jazz.robots.domain.handler.TaskConfigurationHandling
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction

/**
 * Proles task configuration.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProlesTaskConfiguration : TaskConfiguration, AppConfiguration() {

    var prolesAction: ProlesAction? = null

    override fun appName() = appName

    override fun acceptSubmit(handler: TaskConfigurationHandling) = handler.handle(appName, this)
}
