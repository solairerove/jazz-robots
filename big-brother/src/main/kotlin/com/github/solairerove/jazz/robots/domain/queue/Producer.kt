package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Task

/**
 * Queue Producer to send messages into queue.
 */
interface Producer {

    /**
     * Send a task evaluation into queue.
     *
     * @param task a task evaluation
     */
    fun sendMessage(task: Task)
}
