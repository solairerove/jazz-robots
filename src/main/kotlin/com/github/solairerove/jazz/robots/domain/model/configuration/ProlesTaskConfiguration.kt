package com.github.solairerove.jazz.robots.domain.model.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction

/**
 * Proles task configuration.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProlesTaskConfiguration(private val prolesAction: ProlesAction) : TaskConfiguration {

//    override fun getAppName() = appName
}
