package me.xtrm.atlas.stubengine.tests.mappings.kotlin

import me.xtrm.atlas.annotations.mapping.Map

@Map("me/xtrm/test/TestTargetMapping")
interface TestKotlinMapping {
    val testField: String
    @Map("gaming")
    var gamingField: String

    fun runTask(runnable: Runnable)
}
