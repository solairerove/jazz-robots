package com.github.solairerove.jazz.robots.domain.queue

import com.github.solairerove.jazz.robots.domain.model.task.Task
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
        @Autowired val localConsumer: LocalConsumer
) : Producer {

    private val consumer = Executors.newFixedThreadPool(3)

    override fun sendMessage(task: Task) {
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
