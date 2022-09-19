package me.xtrm.atlas.stubengine.generator

import me.xtrm.atlas.stubengine.StubEngine
import me.xtrm.atlas.stubengine.data.MappingClassData
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.ClassNode

/**
 * The default class generator cascading into member-specific generation.
 *
 * @author xtrm
 * @since 0.0.1
 */
object DefaultClassGenerator : IGenerator<MappingClassData, ClassNode> {
    override fun generate(engine: StubEngine, data: MappingClassData): ClassNode {
        val node = ClassNode(Opcodes.ASM9)
        node.visit(Opcodes.V1_5, )

        return node
    }
}
