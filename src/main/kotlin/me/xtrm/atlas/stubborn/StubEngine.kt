package me.xtrm.atlas.stubborn

import me.xtrm.atlas.stubborn.data.parser.ClasspathParser
import me.xtrm.atlas.stubborn.generator.DefaultClassGenerator
import mu.KotlinLogging
import java.nio.file.Path
import kotlin.io.path.absolutePathString

/**
 * Stub engine.
 *
 * @author xtrm
 * @since 0.0.1
 */
data class StubEngine(
    val output: Path,
    val inputFiles: List<Path>,
    val debug: Boolean = false,
): Runnable {
    companion object {
        private val logger by lazy {
            KotlinLogging.logger {}.also {
                it.info { "Initializing Atlas Framework's stub-engine..." }
            }
        }
    }

    override fun run() {
        if (inputFiles.isEmpty()) {
            throw IllegalArgumentException("No input files provided.")
        }

        logger.info("Processing files:")
        inputFiles.map(Path::absolutePathString).forEach(logger::info)

        val mappingData = ClasspathParser.parse(inputFiles)
        if (mappingData.isEmpty()) {
            throw IllegalStateException("No mapping data provided.")
        }

        val classes = mappingData.map {
            DefaultClassGenerator.generate(this@StubEngine, it)
        }.toList()
        if (classes.isEmpty()) {
            throw IllegalStateException("No classes were generated.")
        }

        logger.info("Generated ${classes.size} classes.")

        TODO("too lazy to implement output writing rn")
    }
}
