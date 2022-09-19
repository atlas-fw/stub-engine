package me.xtrm.atlas.stubengine.data

import me.xtrm.atlas.annotations.mapping.MemberModifier

data class MappingMemberData(
    override val names: List<String>,
    /**
     * TODO: Support multiple signature and auto-routing?
     */
    val signature: String,
    val modifiers: List<MemberModifier>
): IMappingData
