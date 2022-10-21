package me.xtrm.atlas.stubborn.data

import java.lang.reflect.Modifier

data class FacadeMemberData(
    override val names: List<String>,
    /**
     * TODO: Support multiple signature and auto-routing?
     */
    val signature: String,
    val modifiers: Int = Modifier.PUBLIC,
) : IFacadeData
