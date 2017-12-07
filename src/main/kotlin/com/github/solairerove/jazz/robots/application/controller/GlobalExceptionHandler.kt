package com.github.solairerove.jazz.robots.application.controller

import com.github.solairerove.jazz.robots.application.dto.ErrorResponse
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import java.util.*

/**
 * Exception handler component.
 */
@ControllerAdvice
class GlobalExceptionHandler {

    private val logger = LoggerFactory.getLogger(GlobalExceptionHandler::class.java)

    /**
     * Handle exception when intended handler are not found.
     *
     * @param exception an exception
     * @return an error message
     */
    @ExceptionHandler(Exception::class)
    @ResponseBody
    fun handleAnException(exception: Exception): ResponseEntity<*> {
        val errorUUID = UUID.randomUUID()
        logger.error("Error-ID: {} - {}", errorUUID, exception.message, exception)

        val message = "An error occurred. Please contact support. Error-ID:" + errorUUID
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), message))
    }
}
