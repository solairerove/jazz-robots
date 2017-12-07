package com.github.solairerove.jazz.robots.application.dto

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction
import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration

@JsonInclude(JsonInclude.Include.NON_NULL)
class ProlesTaskConfigurationRequest(private val prolesAction: ProlesAction) : TaskConfigurationRequest {

    @JsonIgnore
    override fun configurationClass() = ProlesTaskConfiguration::class.java
}
