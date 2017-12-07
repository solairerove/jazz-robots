package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Task
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import java.util.concurrent.Executors

/**
 * Local Task Producer send messages in memory.
 */
@Component
class LocalProducer(
        @Autowired val applicationContext: ApplicationContext,
        @Autowired val localConsumer: LocalConsumer) : Producer {

    private val logger = LoggerFactory.getLogger(LocalProducer::class.java)

    private val consumer = Executors.newFixedThreadPool(3)

    override fun sendMessage(task: Task) {
        logger.info("Send message from producer with $task")
        consumer.submit(ConsumeTask(task, applicationContext, localConsumer))
    }

    /**
     * Consume task from queue, worker emulation.
     */
    class ConsumeTask(val task: Task,
                      private val applicationContext: ApplicationContext,
                      private val localConsumer: LocalConsumer) : Runnable {

        override fun run() {
            val executor = applicationContext.getBean(task.taskConfiguration.executorClass())

            localConsumer.handleMessage(executor.execute(task))
        }
    }
}
