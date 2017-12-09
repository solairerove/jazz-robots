package com.github.solairerove.jazz.robots.domain.model.community

import com.github.solairerove.jazz.robots.domain.model.action.Action
import com.github.solairerove.jazz.robots.domain.model.action.ProlesAction

/**
 * Proles community.
 */
data class ProlesCommunityClass(private val action: ProlesAction) : CommunityClass {

    override fun getAction(): Action = action
}
