package com.github.ledoyen.malbolge.commands

import picocli.CommandLine
import picocli.CommandLine.Command
import picocli.CommandLine.Model.CommandSpec
import picocli.CommandLine.Spec


@Command(name = "Malbolge", version = ["Malbolge v1.0"],
    mixinStandardHelpOptions = true,
    description = ["@|bold Malbolge|@ @|underline interpreter|@ and @|underline seach algorithm|@"],
    subcommands = [InterpretCmd::class])
class Main : Runnable {

    @Spec
    var spec: CommandSpec? = null

    override fun run() {
        throw CommandLine.ParameterException(spec?.commandLine(), "Specify a subcommand")
    }
}
