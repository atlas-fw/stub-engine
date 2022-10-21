package me.xtrm.atlas.stubborn.generator

import me.xtrm.atlas.stubborn.StubEngine
import me.xtrm.atlas.stubborn.data.IFacadeData

sealed interface IGenerator<T: IFacadeData, U> {
    fun generate(engine: StubEngine, data: T): U
}
