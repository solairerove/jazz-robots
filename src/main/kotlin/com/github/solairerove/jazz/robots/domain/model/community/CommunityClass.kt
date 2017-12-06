package com.github.solairerove.jazz.robots.domain.model.community

import com.github.solairerove.jazz.robots.domain.model.action.Action

/**
 * Describe community classes in 1984.
 */
interface CommunityClass {

    /**
     * Get individual action.
     */
    fun getAction(): Action
}
