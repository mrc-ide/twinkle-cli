package twinklecli.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.arguments.multiple

class Add : CliktCommand(help = "Add a new app by <name>, git <repo> and <adminUsers>") {
    private val name by argument()
    private val repo by argument()
    private val adminUsers by argument().multiple(true)
    override fun run() {
        echo("adding a new app: $name from $repo with users $adminUsers")
    }
}
