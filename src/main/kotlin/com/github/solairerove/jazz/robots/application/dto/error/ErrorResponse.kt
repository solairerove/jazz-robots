package com.github.solairerove.jazz.robots.application.dto.error

import java.io.Serializable

/**
 * Error response dto entity.
 */
data class ErrorResponse(val status: Int, val message: String) : Serializable
