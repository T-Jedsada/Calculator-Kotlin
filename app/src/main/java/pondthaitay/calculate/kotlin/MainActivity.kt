package pondthaitay.calculate.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener, MainView {

    private var etNumberOne: EditText? = null
    private var etNumberTwo: EditText? = null
    private var mainController: MainController? = null
    private var tvResult: TextView? = null

    override fun onClick(v: View) {
        val id: Int = v.id
        when (id) {
            R.id.btn_plus -> mainController!!.plus(getValueFromEditText()[0], getValueFromEditText()[1])
            R.id.btn_minus -> mainController!!.minus(getValueFromEditText()[0], getValueFromEditText()[1])
            R.id.btn_multiply -> mainController!!.multiply(getValueFromEditText()[0], getValueFromEditText()[1])
            R.id.btn_divide -> mainController!!.divide(getValueFromEditText()[0], getValueFromEditText()[1])
        }
    }

    override fun setResultCalculate(result: String?) {
        tvResult?.text = result
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumberOne = findViewById(R.id.et_number_1) as EditText
        etNumberTwo = findViewById(R.id.et_number_2) as EditText
        tvResult = findViewById(R.id.tv_result) as TextView

        mainController = MainController(this, Calculator.instance)
    }

    fun getValueFromEditText(): IntArray {
        val numbers: IntArray = kotlin.IntArray(2)
        try {
            numbers[0] = etNumberOne?.text.toString().toInt()
            numbers[1] = etNumberTwo?.text.toString().toInt()
        } catch (e : NumberFormatException) {
            setResultCalculate(e.message)
        }

        return numbers
    }
}
