package com.github.solairerove.jazz.robots.domain.model.action.party

import com.github.solairerove.jazz.robots.domain.model.action.Action

/**
 * Peace ministry actions enum.
 */
enum class PeaceMinistryAction(private val message: String) : Action, MinistryAction {

    WAR("war against some asian country"),

    KILL("Kill in peace ministry");

    override fun possibleValues() = values()

    override fun getMessage() = message

    override fun kill() = KILL
}
