package com.github.solairerove.jazz.robots.domain.model.community.party

import com.github.solairerove.jazz.robots.domain.model.ministry.Ministry

/**
 * Describe party community class.
 */
interface PartyCommunityClass {

    /**
     * Party community need to identify self by community.
     */
    fun getMinistry(): Ministry
}
