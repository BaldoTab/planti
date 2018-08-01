import kotlin.test.assertEquals
import org.junit.Test as test
import init.init

class TestMain {
    @test fun initTest() {
        val result = init()
        val expected = "Project Started"

        assertEquals(result, expected)
    }
}