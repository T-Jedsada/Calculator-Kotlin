package pondthaitay.calculate.kotlin

import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class MainControllerTest {

    @Mock
    private var mockView: MainView? = null

    private var controller: MainController? = null
    private var calculator: Calculator? = null

    @Before
    @Throws(Exception::class)
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        calculator = Calculator.instance
        controller = MainController(mockView!!, calculator!!)
    }

    @Test
    @Throws(Exception::class)
    fun plus() {
        controller?.plus(5,5)
        verify(mockView, times(1))?.setResultCalculate("10")
    }

    @Test
    @Throws(Exception::class)
    fun minus() {
        controller?.minus(5,5)
        verify(mockView, times(1))?.setResultCalculate("0")
    }

    @Test
    @Throws(Exception::class)
    fun multiply() {
        controller?.multiply(5,5)
        verify(mockView, times(1))?.setResultCalculate("25")
    }

    @Test
    @Throws(Exception::class)
    fun divide() {
        controller?.divide(5,5)
        verify(mockView, times(1))?.setResultCalculate("1")
    }

    @Test
    @Throws(Exception::class)
    fun divideByZero() {
        controller?.divide(5,0)
        verify(mockView, times(1))?.setResultCalculate("DivideByZeroException")
    }
}