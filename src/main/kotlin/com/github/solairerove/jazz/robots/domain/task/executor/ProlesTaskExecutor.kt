package com.github.solairerove.jazz.robots.domain.task.executor

import com.github.solairerove.jazz.robots.domain.model.configuration.TaskConfiguration
import com.github.solairerove.jazz.robots.domain.model.task.Result
import org.springframework.stereotype.Service

@Service
class ProlesTaskExecutor : AbstractTaskExecutor(), TaskExecutor{

    override fun resolveResult(taskId: String?, configuration: TaskConfiguration) = Result(taskId, "SOME DATA")
}
