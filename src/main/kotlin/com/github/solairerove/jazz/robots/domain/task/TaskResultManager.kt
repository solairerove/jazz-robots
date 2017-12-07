package com.github.solairerove.jazz.robots.domain.task

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import com.github.solairerove.jazz.robots.domain.repository.TaskResultRepository
import org.springframework.stereotype.Service
import java.io.Serializable

@Service
class TaskResultManager (val taskResultRepository: TaskResultRepository) : TaskResultManagement {

    override fun register(appName: String, configuration: TaskConfiguration): TaskResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(taskId: String, status: Status): TaskResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(taskId: String, result: Serializable): TaskResult {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun load(appName: String, taskIds: List<String>): List<TaskResult> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(appName: String): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
