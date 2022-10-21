package me.xtrm.atlas.stubborn

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.required
import com.github.ajalt.clikt.parameters.types.file

class StubEngineCLI: CliktCommand() {
    val classPath by option("-cp", "--classpath", help = "The facade classpath to use for the stub engine.").required()
    val output by option("-o", "--output", help = "The output file/directory.").file().required()
    val classes by option("-c", "--classes", help = "Outputs classes instead of a jarfile.").flag()

    override fun run() {
        echo("Hello, world!")
    }
}

/**
 * The engine's main entrypoint, used as a CLI wrapper for [StubEngine].
 *
 * @since 0.0.1
 */
fun main(args: Array<String>) =
    StubEngineCLI().main(args)
