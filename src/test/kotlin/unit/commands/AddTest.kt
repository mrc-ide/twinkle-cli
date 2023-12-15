package packit.test.unit.commands

import com.github.ajalt.clikt.testing.test
import org.junit.jupiter.api.Test
import twinklecli.commands.Add
import kotlin.test.assertEquals

class AddTest {
    @Test
    fun `can add app`()
    {
        val sut = Add().test("testApp", "http://test", "user1", "user2")
        sut.run()
    }
}