import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertThrows
import kotlin.properties.Delegates

internal class FractionsTest {
    var first by Delegates.notNull<SimpleFraction>()
    var second by Delegates.notNull<SimpleFraction>()

    @BeforeEach
    fun setUp() {
        first = Fractions(4, 5)
        second = Fractions(4, 10)
    }

    @Test
    fun plus() {
        assert(Fractions(12, 10).equals(first + second))
    }

    @Test
    fun minus() {
        assert(Fractions(4, 10).equals(first - second))
    }

    @Test
    fun div() {
        assert(Fractions(2, 1).equals(first / second))
    }

    @Test
    fun times() {
        assert(Fractions(16, 50).equals(first * second))
    }

    @Test
    fun divisionByZeroCheck() {
        assertThrows<ArithmeticException>() {
            Fractions(1, 0)
        }
    }

}