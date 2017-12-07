package com.github.solairerove.jazz.robots.domain.model.configuration

/**
 * Proles task configuration.
 */
class ProlesTaskConfiguration(private val appName: String) : TaskConfiguration {

    override fun getAppName() = appName
}
