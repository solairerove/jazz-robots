package com.github.solairerove.jazz.robots.application.auditing

/**
 * Annotation to indicate the Audit Entry must be logged when the method was entered.
 */
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
annotation class Audit
