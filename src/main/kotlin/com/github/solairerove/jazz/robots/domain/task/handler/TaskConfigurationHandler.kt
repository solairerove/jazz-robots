package com.github.solairerove.jazz.robots.domain.task.handler

import com.github.solairerove.jazz.robots.domain.model.configuration.ProlesTaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.exception.ValueNotAllowedException
import com.github.solairerove.jazz.robots.domain.model.task.Task
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import com.github.solairerove.jazz.robots.domain.queue.Producer
import com.github.solairerove.jazz.robots.domain.task.TaskResultManagement
import org.springframework.stereotype.Service

/**
 * Task Configuration handler.
 */
@Service
class TaskConfigurationHandler (
        val taskResultManagement: TaskResultManagement,
        val producer: Producer) : TaskConfigurationHandling {

    override fun handle(appName: String?, configuration: ProlesTaskConfiguration): TaskResult {
        if (configuration.prolesAction == null) {
            throw ValueNotAllowedException("Prole action can't be empty")
        }

        return handleConfiguration(appName, configuration)
    }

    private fun handleConfiguration(appName: String?, taskConfiguration: TaskConfiguration): TaskResult {
        val taskResult = taskResultManagement.register(appName, taskConfiguration)

        producer.sendMessage(Task(taskResult.id, taskResult.taskConfiguration))

        return taskResultManagement.update(taskResult.id, Status.IN_PROGRESS)
    }
}
