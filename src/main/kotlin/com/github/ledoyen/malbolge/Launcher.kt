package com.github.ledoyen.malbolge

import com.github.ledoyen.malbolge.commands.Main
import picocli.CommandLine

fun main(args: Array<String>) {

    CommandLine.run(Main(), System.out, *args)
}
