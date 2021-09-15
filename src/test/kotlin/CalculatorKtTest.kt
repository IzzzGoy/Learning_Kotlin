import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertIsNot

internal class CalculatorKtTest {

    @Test
    fun calculateTest() {
        val expression = "1 + 5"
        assert(runCatching { calculate(expression) }.isSuccess)
        assertEquals(6.0, calculate(expression))
    }

    @Test
    fun handleDivideByZeroException() {
        val exception = "3 / 0"
        assertThrows<Exception>() {
            calculate(exception)
        }
    }

    @Test
    fun handleWrongQuantityOfNumbersTree() {
        val exception = "3 / 2 3"
        assertThrows<Exception>() {
            calculate(exception)
        }
    }

    @Test
    fun handleWrongQuantityOfNumbersOne() {
        val exception = "3 / "
        assertThrows<Exception>() {
            calculate(exception)
        }
    }

    @Test
    fun handleMissingOperation() {
        val exception = "3 4"
        assertThrows<Exception>() {
            calculate(exception)
        }
    }

    @Test
    fun handleUnknownOperation() {
        val exception = "3 f 4"
        assertThrows<Exception>() {
            calculate(exception)
        }
    }

    @Test
    fun handleUnknownVariable() {
        val exception = "g + 4"
        assertThrows<Exception>() {
            calculate(exception)
        }
    }
}