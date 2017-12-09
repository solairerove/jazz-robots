package com.github.solairerove.jazz.robots.domain.repository

import com.github.solairerove.jazz.robots.domain.model.task.TaskResult
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Task result repository which uses MongoDB as a storage.
 */
interface TaskResultRepository : MongoRepository<TaskResult, String> {
}
