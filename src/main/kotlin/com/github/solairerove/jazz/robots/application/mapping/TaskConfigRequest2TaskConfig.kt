package com.github.solairerove.jazz.robots.application.mapping

import com.github.solairerove.jazz.robots.application.dto.config.ProlesTaskConfigurationRequest
import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration
import org.dozer.loader.api.BeanMappingBuilder
import org.dozer.loader.api.TypeMappingOptions.oneWay

/**
 * Mapping rules for task config requests to task configs.
 */
class TaskConfigRequest2TaskConfig : BeanMappingBuilder() {

    override fun configure() {
        mapping(ProlesTaskConfigurationRequest::class.java, ProlesTaskConfiguration::class.java, oneWay())
                .fields("prolesAction", "prolesAction")
    }
}
