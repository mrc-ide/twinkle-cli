package packit.test.unit.commands

import com.github.ajalt.clikt.testing.test
import org.junit.jupiter.api.Test
import twinklecli.commands.AddCommand
import kotlin.test.assertEquals

class AddCommandTest {
    @Test
    fun `can add app`()
    {
        val result = AddCommand().test("testApp", "http://test", "user1", "user2")
        assertEquals("adding a new app: testApp from http://test with users [user1, user2]\n", result.stdout)
        assertEquals(0, result.statusCode)
    }
}