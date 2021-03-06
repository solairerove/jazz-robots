package com.github.solairerove.jazz.robots.domain.task

import com.github.solairerove.jazz.robots.domain.model.configuration.AppConfiguration
import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import com.github.solairerove.jazz.robots.domain.repository.TaskResultRepository
import org.springframework.stereotype.Service
import java.io.Serializable

@Service
class TaskResultManager (val taskResultRepository: TaskResultRepository) : TaskResultManagement {

    override fun register(appName: String?, configuration: TaskConfiguration): TaskResult {
        (configuration as AppConfiguration).appName  = appName
        val result = TaskResult(configuration)
        result.status = Status.CREATED

        return taskResultRepository.save(result)
    }

    override fun update(taskId: String?, status: Status): TaskResult {
        val taskResult = taskResultRepository.findOne(taskId)

        taskResult.status = status

        return taskResultRepository.save(taskResult)
    }

    override fun update(taskId: String?, result: Serializable): TaskResult {
        val taskResult = taskResultRepository.findOne(taskId)

        taskResult.result = result
        taskResult.status = Status.COMPLETED

        return taskResultRepository.save(taskResult)
    }

    override fun load(appName: String, taskIds: List<String>): List<TaskResult> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun count(appName: String): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
