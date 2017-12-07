package com.github.solairerove.jazz.robots.domain.task

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import com.github.solairerove.jazz.robots.domain.model.task.status.Status
import java.io.Serializable

/**
 * Service to manage a task result.
 */
interface TaskResultManagement {

    /**
     * Register a TaskResult in storage.
     *
     * @param appName       an appName
     * @param configuration a task configuration
     * @return stored task result
     */
    fun register(appName: String?, configuration: TaskConfiguration): TaskResult

    /**
     * Update status of TaskResult in storage.
     *
     * @param taskId a task identifier.
     * @param status a status
     * @return stored task result with updated status
     */
    fun update(taskId: String?, status: Status): TaskResult

    /**
     * Update result of TaskResult in storage.
     *
     * @param taskId a task identifier.
     * @param result a result of task execution
     * @return stored task result
     */
    fun update(taskId: String?, result: Serializable): TaskResult

    /**
     * Load list of TaskResult from storage with task ids.
     *
     * @param appName an app name
     * @param taskIds list of task ids
     * @return loaded task results
     */
    fun load(appName: String, taskIds: List<String>): List<TaskResult>

    /**
     * Count TaskResults are acceptable for appName.
     *
     * @param appName an app name
     * @return amount of objects
     */
    fun count(appName: String): Long
}