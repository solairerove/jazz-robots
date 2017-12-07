package com.github.solairerove.jazz.robots.domain.model.action.party

import com.github.solairerove.jazz.robots.domain.model.action.Action

/**
 * Truth ministry actions enum.
 */
enum class TruthMinistryAction(private val message: String) : Action, MinistryAction {

    CONTROLS_INFORMATION("propagate information"),

    CONTROLS_NEWS("propagate news"),

    CONTROLS_ENTERTAINMENT("propagate entertainment"),

    CONTROLS_EDUCATION("propagate education"),

    CONTROLS_THE_ARTS("propagate the arts"),

    KILL("Kill in truth ministry");

    override fun possibleValues() = values()

    override fun getMessage() = message

    override fun kill() = KILL
}
