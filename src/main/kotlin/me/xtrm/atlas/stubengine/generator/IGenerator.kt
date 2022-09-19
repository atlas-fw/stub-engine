package me.xtrm.atlas.stubengine.generator

import me.xtrm.atlas.stubengine.StubEngine
import me.xtrm.atlas.stubengine.data.IMappingData

sealed interface IGenerator<T: IMappingData, U> {
    fun generate(engine: StubEngine, data: T): U
}
