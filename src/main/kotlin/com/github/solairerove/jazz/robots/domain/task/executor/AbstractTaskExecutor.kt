package com.github.solairerove.jazz.robots.domain.task.executor

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.Result
import com.github.solairerove.jazz.robots.domain.model.task.Task

/**
 * Basic Task Executor to running a task with configuration.
 */
abstract class AbstractTaskExecutor : TaskExecutor {

    override fun execute(task: Task): Result {
            return resolveResult(task.id, task.taskConfiguration)
    }

    /**
     * Resolve a result of the task with specified configuration.
     *
     * @param taskId        a task identifier
     * @param configuration a configuration
     * @return an execution Task Result.
     */
    protected abstract fun resolveResult(taskId: String, configuration: TaskConfiguration): Result
}
