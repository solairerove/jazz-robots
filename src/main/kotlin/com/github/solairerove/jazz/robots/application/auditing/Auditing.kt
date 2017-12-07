package com.github.solairerove.jazz.robots.application.auditing

/**
 * The Audit Service interface.
 */
interface Auditing {

    /**
     * Write an audit massage for an app in case of special event.
     *
     * @param auditMessage a message
     */
    fun logApp(auditMessage: String)
}
