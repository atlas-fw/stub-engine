package me.xtrm.atlas.stubborn.generator

import me.xtrm.atlas.stubborn.StubEngine
import me.xtrm.atlas.stubborn.data.FacadeClassData
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode

/**
 * The default class generator cascading into member-specific generation.
 *
 * @author xtrm
 * @since 0.0.1
 */
object DefaultClassGenerator : IGenerator<FacadeClassData, ClassNode> {
    override fun generate(engine: StubEngine, data: FacadeClassData): ClassNode {
        val node = ClassNode(Opcodes.ASM9)
        node.visit(
            Opcodes.V1_5,
            Opcodes.ACC_PUBLIC,
            data.names[0], //TODO: implement global dictionary override
            data.signature,
            data.superClass,
            data.interfaces.toTypedArray()
        )

        return node
    }
}
