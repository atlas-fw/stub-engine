package me.xtrm.atlas.stubengine.data

import java.lang.reflect.Modifier

/**
 * Data representation of a mapping class, including attributes and members.
 *
 * @author xtrm
 * @since 0.0.1
 */
data class MappingClassData(
    override val names: List<String>,
    val modifiers: Int = Modifier.PUBLIC,
    val fields: List<MappingMemberData> = emptyList(),
    val methods: List<MappingMemberData> = emptyList(),
) : IMappingData
