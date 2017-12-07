package com.github.solairerove.jazz.robots.domain.model.task

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration

/**
 * Task to execute a community.
 */
data class Task(val id: String, val taskConfiguration: TaskConfiguration) {

}
