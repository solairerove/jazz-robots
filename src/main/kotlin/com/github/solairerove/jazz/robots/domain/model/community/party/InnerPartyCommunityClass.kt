package com.github.solairerove.jazz.robots.domain.model.community.party

import com.github.solairerove.jazz.robots.domain.model.action.Action
import com.github.solairerove.jazz.robots.domain.model.action.party.PeaceMinistryAction
import com.github.solairerove.jazz.robots.domain.model.community.CommunityClass
import com.github.solairerove.jazz.robots.domain.model.ministry.Ministry

/**
 * Inner party community.
 */
data class InnerPartyCommunityClass(
        private val action: Action,
        private val ministry: Ministry
) : CommunityClass, PartyCommunityClass {

    override fun getAction(): Action = action

    override fun getMinistry(): Ministry = ministry
}
