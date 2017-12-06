package com.github.solairerove.jazz.robots.domain.model.community.party

import com.github.solairerove.jazz.robots.domain.model.action.Action
import com.github.solairerove.jazz.robots.domain.model.action.party.InteriorMinistryAction
import com.github.solairerove.jazz.robots.domain.model.community.CommunityClass
import com.github.solairerove.jazz.robots.domain.model.ministry.Ministry

/**
 * Outer party community.
 */
data class OuterPartyCommunityClass(
        private val action: Action,
        private val ministry: Ministry
) : CommunityClass, PartyCommunityClass {

    override fun getAction(): Action = action

    override fun getMinistry(): Ministry = ministry
}
