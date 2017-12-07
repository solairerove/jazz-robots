package com.github.solairerove.jazz.robots.application.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction
import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration

/**
 * Proles task configuration request.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class ProlesTaskConfigurationRequest : TaskConfigurationRequest {

    @JsonProperty(value = "prolesAction")
    var prolesAction: ProlesAction = ProlesAction.WORK

    @JsonIgnore
    override fun configurationClass() = ProlesTaskConfiguration::class.java
}
