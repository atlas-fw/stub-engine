package me.xtrm.atlas.stubengine.data

/**
 * Super-interface for all mapping-related members.
 *
 * @author xtrm
 * @since 0.0.1
 */
sealed interface IMappingData {
    /**
     * The list of names this mapping member can be matched to.
     */
    val names: List<String>
}
