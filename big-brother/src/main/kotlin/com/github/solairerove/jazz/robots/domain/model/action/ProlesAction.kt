package com.github.solairerove.jazz.robots.domain.model.action

/**
 * Proles actions enum.
 */
enum class ProlesAction(private val message: String) : Action {

    EAT("eat"),

    DRINK("drink"),

    WORK("work"),

    SLEEP("sleep");

    override fun possibleValues(): Array<ProlesAction> = values()

    override fun getMessage() = message
}
