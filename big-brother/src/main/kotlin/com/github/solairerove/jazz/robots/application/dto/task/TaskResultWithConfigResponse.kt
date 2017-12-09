package com.github.solairerove.jazz.robots.application.dto.task

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import java.io.Serializable
import java.time.LocalDateTime

/**
 * Task result with configuration response.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class TaskResultWithConfigResponse<T : Serializable> : TaskResultResponse<T>() {

    @JsonProperty
    var configuration: TaskConfiguration? = null

    @JsonProperty
    var createdAt: LocalDateTime? = null
}
