package com.github.solairerove.jazz.robots.config

import com.github.solairerove.jazz.robots.application.interceptor.EndpointInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Root configuration class to hold all references to other configs.
 */
@Configuration
class ApplicationConfig(val interceptor: EndpointInterceptor) : WebMvcConfigurerAdapter() {

    /**
     * Proles configuration name.
     */
    companion object {
        const val PROLES_APP_NAME = "proles"
    }

    override fun addInterceptors(registry: InterceptorRegistry?) {
        registry!!.addInterceptor(interceptor)
    }
}
