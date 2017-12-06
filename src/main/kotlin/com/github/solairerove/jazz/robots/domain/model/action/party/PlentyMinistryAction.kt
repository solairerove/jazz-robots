package com.github.solairerove.jazz.robots.domain.model.action.party

import com.github.solairerove.jazz.robots.domain.model.action.Action

/**
 * Plenty ministry actions enum.
 */
enum class PlentyMinistryAction(private val message: String) : Action, MinistryAction {

    RATIONS("rations food, goods, and domestic production"),

    CONTROLS("controls food, goods, and domestic production"),

    RAISED_THE_STANDARD_OF_LIVING("reduced  the standard of living");
}
