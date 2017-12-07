package com.github.solairerove.jazz.robots.application.interceptor

import com.github.solairerove.jazz.robots.application.auditing.Audit
import com.github.solairerove.jazz.robots.application.auditing.Auditing
import org.springframework.stereotype.Component
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.HandlerMapping
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * Sets current app for a user. Audits endpoint access.
 */
@Component
class EndpointInterceptor(val auditing: Auditing) : HandlerInterceptorAdapter() {

    override fun preHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?): Boolean {
        audit(request, handler)
        return super.preHandle(request, response, handler)
    }

    private fun audit(request: HttpServletRequest?, handler: Any?) {
        val handlerMethod = handler as HandlerMethod
        val audit = handlerMethod.getMethodAnnotation(Audit::class.java)
        if (audit != null) {

            val message = ("Called controller for path: " + request!!.method + " "
                    + request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE))

            val args = StringBuilder()
            for ((key, value) in request.parameterMap) {
                for (v in value) {
                    args.append(if (args.isEmpty()) '?' else '&').append(key).append('=').append(v)
                }
            }

            auditing.logApp(message + args)
        }
    }
}
