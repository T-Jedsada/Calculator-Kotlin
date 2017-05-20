package pondthaitay.calculate.kotlin

class Calculator private constructor() {

    init {
        // TODO : initialized the first time
    }

    private object Holder {
        val INSTANCE = Calculator()
    }

    companion object {
        val instance: Calculator by lazy { Holder.INSTANCE }
    }

    fun plus(x: Int, y: Int): Int {
        return x + y
    }

    fun minus(x: Int, y: Int): Int {
        return x - y
    }

    fun multiply(x: Int, y: Int): Int {
        return x * y
    }

    fun divide(x: Int, y: Int): Int {
        if (y == 0) throw (DivideByZeroException())
        return x / y
    }
}