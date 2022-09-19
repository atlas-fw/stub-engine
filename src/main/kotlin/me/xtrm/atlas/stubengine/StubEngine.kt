package me.xtrm.atlas.stubengine

import me.xtrm.atlas.stubengine.data.parser.ClasspathParser
import me.xtrm.atlas.stubengine.generator.DefaultClassGenerator
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
        private val logger = KotlinLogging.logger {}
    }

    override fun run() {
        logger.info("Running Atlas Framework's stub-engine...")

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
