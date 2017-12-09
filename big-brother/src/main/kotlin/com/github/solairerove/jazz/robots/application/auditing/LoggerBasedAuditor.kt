package com.github.solairerove.jazz.robots.application.auditing

import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

/**
 * Auditor implementation which writes Audit Entries into a LogFile.
 * To get proper separated AuditLogs please configure logging Framework that all Logs written from this class
 * are stored in one specific AuditLog file.
 * <p>
 * Writes INFO logs for auditMessages and ERROR logs for Error-Audit-messages.
 */
@Service
class LoggerBasedAuditor : Auditing {

    private val logger = LoggerFactory.getLogger(LoggerBasedAuditor::class.java)

    override fun logApp(auditMessage: String) {
        if (StringUtils.isBlank(auditMessage)) {
            throw IllegalArgumentException("auditMessage is mandatory")
        }

        logger.info("Audit Log from app - Message: $auditMessage")
    }
}
