package com.github.solairerove.jazz.robots.domain.task

import com.github.solairerove.jazz.robots.domain.task.handler.TaskConfigurationHandling
import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LocalTaskManager(@Autowired val configurationHandler: TaskConfigurationHandling) : TaskManagement {

    override fun executeTask(configuration: TaskConfiguration) = configuration.acceptSubmit(configurationHandler)
}
