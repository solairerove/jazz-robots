package com.github.solairerove.jazz.robots.application.mapping

import com.github.solairerove.jazz.robots.application.dto.task.TaskResultWithConfigResponse
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import org.dozer.loader.api.BeanMappingBuilder
import org.dozer.loader.api.FieldsMappingOptions.copyByReference
import org.dozer.loader.api.TypeMappingOptions

/**
 * Mapping rules for TaskResult to TaskResultWithConfigResponse.
 */
class TaskResult2TaskResultWithConfigResponse : BeanMappingBuilder() {

    override fun configure() {
        mapping(TaskResult::class.java, TaskResultWithConfigResponse::class.java, TypeMappingOptions.oneWay())
                .fields("id", "id")
                .fields("status", "status")
                .fields("result", "result", copyByReference())
                .fields("taskConfiguration", "configuration", copyByReference())
                .fields("createdAt", "createdAt", copyByReference())
    }
}
