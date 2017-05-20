package pondthaitay.calculate.kotlin

class MainController(private var view: MainView,
                     private val calculator: Calculator) {

    fun plus(x: Int, y: Int): Unit {
        view.setResultCalculate(calculator.plus(x, y).toString())
    }

    fun minus(x: Int, y: Int): Unit {
        view.setResultCalculate(calculator.minus(x, y).toString())
    }

    fun multiply(x: Int, y: Int): Unit {
        view.setResultCalculate(calculator.multiply(x, y).toString())
    }

    fun divide(x: Int, y: Int): Unit {
        try {
            view.setResultCalculate(calculator.divide(x, y).toString())
        } catch (e: DivideByZeroException) {
            view.setResultCalculate(e.message!!)
        }
    }
}