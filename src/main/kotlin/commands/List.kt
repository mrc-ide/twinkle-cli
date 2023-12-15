package twinklecli.commands

import com.github.ajalt.clikt.core.CliktCommand

class List : CliktCommand(help = "List all apps") {
    override fun run() {
        echo("listing all apps")
    }
}
