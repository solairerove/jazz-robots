package com.github.solairerove.jazz.robots.domain.task

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult

/**
 * Manager to manage tasks.
 */
interface TaskManagement {

    /**
     * Execute a task.
     *
     * @param configuration a task configuration.
     * @return an execution Task Result.
     */
    fun executeTask(configuration: TaskConfiguration): TaskResult
}