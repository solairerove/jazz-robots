package com.github.solairerove.jazz.robots.domain.model.task.status

/**
 * List of Task statuses.
 */
enum class Status {

    /**
     * Task created.
     */
    CREATED,

    /**
     * Task submitted.
     */
    SUBMITED,

    /**
     * Task in progress.
     */
    IN_PROGRESS,

    /**
     * Task stopping.
     */
    STOPPING,

    /**
     * Task stopped.
     */
    STOPPED,

    /**
     * Task completed.
     */
    COMPLETED,

    /**
     * Task failed.
     */
    FAILED
}
