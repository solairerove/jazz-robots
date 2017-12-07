package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Result

/**
 * Queue Consumer to receive messages from queue.
 */
interface Consumer {

    /**
     * Handle an event of receiving a task result from queue.
     *
     * @param result a task result
     */
    fun handleMessage(result: Result)
}
