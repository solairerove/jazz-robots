package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Result
import com.github.solairerove.jazz.robots.domain.task.TaskResultManagement
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

/**
 * Local Result Consumer read messages from memory.
 */
@Component
class LocalConsumer(val taskResultManagement: TaskResultManagement) : Consumer {

    private val logger = LoggerFactory.getLogger(LocalConsumer::class.java)

    override fun handleMessage(result: Result) {
        logger.info("Consume $result")

        taskResultManagement.update(result.id, result.data)
    }
}
