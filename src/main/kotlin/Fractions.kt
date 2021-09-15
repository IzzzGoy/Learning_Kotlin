/**
 * Create class Fractions, that represents a simple fraction with numerator and denominator.
 * Create for this class all arithmetical operations (divide, plus, minus, e.t.c.).
 * Class must implement interface SimpleFraction.
 * You must handle divide by zero Exception on create object.
 *
 * @throws ArithmeticException when denominator equals zero.
 * */

interface SimpleFraction {
    abstract val numerator: Int
    abstract val denominator: Int

    operator fun plus(other: SimpleFraction): SimpleFraction
    operator fun minus(other: SimpleFraction): SimpleFraction
    operator fun div(other: SimpleFraction): SimpleFraction
    operator fun times(other: SimpleFraction): SimpleFraction

    fun equals(other: SimpleFraction) = (numerator.toDouble() / denominator) == (other.numerator.toDouble() / other.denominator)
}

/**
 * Fractions class
 * @property numerator numerator of Fraction.
 * @property denominator denominator of Fraction.
 * @throws ArithmeticException when denominator equals zero.
 * */
class Fractions(
    override val numerator: Int,
    override val denominator: Int
    ): SimpleFraction {

    override fun plus(other: SimpleFraction): SimpleFraction {
        TODO("Not yet implemented")
    }

    override fun minus(other: SimpleFraction): SimpleFraction {
        TODO("Not yet implemented")
    }

    override fun div(other: SimpleFraction): SimpleFraction {
        TODO("Not yet implemented")
    }

    override fun times(other: SimpleFraction): SimpleFraction {
        TODO("Not yet implemented")
    }

}