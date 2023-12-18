package twinklecli.unit.commands

import com.github.ajalt.clikt.testing.test
import org.junit.jupiter.api.Test
import twinklecli.commands.ListCommand
import kotlin.test.assertEquals

class ListCommandTest {
    @Test
    fun `can list apps`() {
        val result = ListCommand().test()
        assertEquals("listing all apps\n", result.stdout)
        assertEquals(0, result.statusCode)
    }
}
