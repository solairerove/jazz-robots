package com.github.solairerove.jazz.robots.application.dto.config

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import java.io.Serializable

/**
 * Task configuration entity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes(
    JsonSubTypes.Type(value = ProlesTaskConfigurationRequest::class, name = "proles")
)
interface TaskConfigurationRequest : Serializable {

    fun configurationClass(): Class<out TaskConfiguration>
}
