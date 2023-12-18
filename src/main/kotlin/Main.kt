package twinklecli

import com.github.ajalt.clikt.core.subcommands
import twinklecli.commands.AddCommand
import twinklecli.commands.ListCommand
import twinklecli.commands.TwinkleCLI

fun main(args: Array<String>) = TwinkleCLI()
    .subcommands(AddCommand(), ListCommand())
    .main(args)
