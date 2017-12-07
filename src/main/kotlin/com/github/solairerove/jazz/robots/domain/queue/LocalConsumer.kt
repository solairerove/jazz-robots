package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Result
import com.github.solairerove.jazz.robots.domain.task.TaskResultManagement
import org.springframework.stereotype.Component

/**
 * Local Result Consumer read messages from memory.
 */
@Component
class LocalConsumer(val taskResultManagement: TaskResultManagement) : Consumer {

    override fun handleMessage(result: Result) {
        taskResultManagement.update(result.id, result.data)
    }
}
