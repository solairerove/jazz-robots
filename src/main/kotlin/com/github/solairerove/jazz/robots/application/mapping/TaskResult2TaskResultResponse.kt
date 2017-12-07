package com.github.solairerove.jazz.robots.application.mapping

import com.github.solairerove.jazz.robots.application.dto.task.TaskResultResponse
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import org.dozer.loader.api.BeanMappingBuilder
import org.dozer.loader.api.FieldsMappingOptions.copyByReference
import org.dozer.loader.api.TypeMappingOptions

/**
 * Mapping rules for TaskResult to TaskResultResponse.
 */
class TaskResult2TaskResultResponse : BeanMappingBuilder() {

    override fun configure() {
        mapping(TaskResult::class.java, TaskResultResponse::class.java, TypeMappingOptions.oneWay())
                .fields("id", "id")
                .fields("status", "status")
                .fields("result", "result", copyByReference())
    }
}
