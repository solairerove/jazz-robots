package com.github.solairerove.jazz.robots.domain.model.action.party

import com.github.solairerove.jazz.robots.domain.model.action.Action

/**
 * Interior ministry actions enum.
 */
enum class InteriorMinistryAction(private val message: String) : Action, MinistryAction {

    IDENTIFY("identify"),

    MONITOR("monitor"),

    CONVERT_REAL_DISSIDENTS("convert real dissidents"),

    CONVERT_IMAGINED_DISSIDENTS("convert imagined dissidents");
}
