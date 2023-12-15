package twinklecli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple

// TODO: Move these to commands dir
class TwinkleCLI: CliktCommand() {
    override fun run() = Unit
}

class Add: CliktCommand(help="Add a new app by <name>, git <repo> and <adminUsers>") {
    private val name by argument()
    private val repo by argument()
    private val adminUsers by argument().multiple(true)
    override fun run() {
        echo("adding a new app: $name from $repo with users $adminUsers")
    }
}

class List: CliktCommand(help="List all apps") {
    override fun run() {
        echo("listing all apps")
    }
}

fun main(args: Array<String>) = TwinkleCLI()
    .subcommands(Add(), List())
    .main(args)