package twinklecli

import com.github.ajalt.clikt.core.subcommands
import twinklecli.commands.Add
import twinklecli.commands.List
import twinklecli.commands.TwinkleCLI

fun main(args: Array<String>) = TwinkleCLI()
    .subcommands(Add(), List())
    .main(args)
