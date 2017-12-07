package com.github.solairerove.jazz.robots.domain.model.configuration

import org.springframework.data.mongodb.core.index.Indexed

/**
 * Application task configuration.
 */
open class AppConfiguration {

    @Indexed
    var appName: String? = null
}
