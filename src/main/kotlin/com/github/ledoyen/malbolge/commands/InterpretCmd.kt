package com.github.ledoyen.malbolge.commands

import picocli.CommandLine.Command
import picocli.CommandLine.Parameters

@Command(name = "interpreter", mixinStandardHelpOptions = true,
    description = ["Interpret the given program"])
class InterpretCmd : Runnable {

    @Parameters(index = "0")
    private var program: String = ""

    override fun run() {
        println("Program: $program")
    }
}
