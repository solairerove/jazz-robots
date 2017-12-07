package com.github.solairerove.jazz.robots.domain.model.task

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.format.annotation.DateTimeFormat
import java.io.Serializable
import java.time.LocalDateTime

@Document(collection = "taskResult")
class TaskResult : Serializable {

    @Id
    var id: String? = null

    var status: Status = Status.SUBMITED

    var taskConfiguration: TaskConfiguration? = null

    @CreatedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    var createdAt: LocalDateTime = LocalDateTime.now()

    var result: Serializable? = null
}
