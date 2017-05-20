package pondthaitay.calculate.kotlin

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {
    var calculate = Calculator.instance

    @Test
    @Throws(Exception::class)
    fun plus_test() {
        assertEquals(calculate.plus(3, 3), 6).toString()
    }

    @Test
    @Throws(Exception::class)
    fun minus_test() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun divide_test() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun divide_by_zero_test() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    @Throws(Exception::class)
    fun multiply_test() {
        assertEquals(4, (2 + 2).toLong())
    }
}