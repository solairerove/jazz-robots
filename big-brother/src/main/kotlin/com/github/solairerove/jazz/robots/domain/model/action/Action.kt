package com.github.solairerove.jazz.robots.domain.model.action

/**
 * Some community action.
 */
interface Action {

    /**
     * Return possible values for each enum.
     */
    fun possibleValues(): Array<out Action>

    /**
     * Return action message.
     */
    fun getMessage(): String
}
