package com.github.solairerove.jazz.robots.application.dto.task

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import java.io.Serializable

/**
 * Task status response entity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
open class TaskResultResponse<T : Serializable?> : Serializable {

    @JsonProperty
    var id: String? = null

    @JsonProperty
    var status: Status? = null

    @JsonProperty
    var result: T? = null
}
