package com.github.solairerove.jazz.robots.domain.task.executor

import com.github.solairerove.jazz.robots.domain.model.task.Result
import com.github.solairerove.jazz.robots.domain.model.task.Task

/**
 * Task Executor Service, run a task with configuration.
 */
interface TaskExecutor {

    /**
     * Execute task with configuration.
     *
     * @param task a task configuration
     * @return an execution Task Result.
     */
    fun execute(task: Task): Result
}
