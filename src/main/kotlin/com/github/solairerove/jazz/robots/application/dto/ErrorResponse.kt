package com.github.solairerove.jazz.robots.application.dto

import java.io.Serializable

data class ErrorResponse(val status: Int, val message: String) : Serializable
