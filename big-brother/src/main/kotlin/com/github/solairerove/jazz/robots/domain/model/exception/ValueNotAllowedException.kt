package com.github.solairerove.jazz.robots.domain.model.exception

/**
 * Exception if something with request wrong.
 */
class ValueNotAllowedException : RuntimeException {

    constructor(message: String?) : super(message)

    constructor(message: String?, cause: Throwable?) : super(message, cause)
}
