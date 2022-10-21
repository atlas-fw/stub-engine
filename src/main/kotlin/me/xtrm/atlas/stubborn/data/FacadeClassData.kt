package me.xtrm.atlas.stubborn.data

import java.lang.reflect.Modifier

/**
 * Data representation of a mapping class, including attributes and members.
 *
 * @author xtrm
 * @since 0.0.1
 */
data class FacadeClassData(
    override val names: List<String>,
    val modifiers: Int = Modifier.PUBLIC,
    val superClass: String = "java/lang/Object",
    val interfaces: List<String> = emptyList(),
    val signature: String? = null,
    val fields: List<FacadeMemberData> = emptyList(),
    val methods: List<FacadeMemberData> = emptyList(),
) : IFacadeData
