package com.ndcoding.ndccalculator.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ndcoding.ndccalculator.functions.CalculatorAction
import com.ndcoding.ndccalculator.functions.CalculatorOperation
import com.ndcoding.ndccalculator.functions.CalculatorState
import java.lang.Math.cbrt
import kotlin.math.absoluteValue
import kotlin.math.acos
import kotlin.math.asin
import kotlin.math.atan
import kotlin.math.cosh
import kotlin.math.ln
import kotlin.math.log10
import kotlin.math.log2
import kotlin.math.sin
import kotlin.math.sinh
import kotlin.math.sqrt
import kotlin.math.tan
import kotlin.math.tanh

class CalculatorViewModel: ViewModel() {
    var state by mutableStateOf(CalculatorState())

    private var memoryValue by mutableStateOf("0")

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
            is CalculatorAction.ToggleSign -> toggleSign()
            is CalculatorAction.SquareRoot -> calculateSquareRoot()
            is CalculatorAction.Percentage -> calculatePercentage()
            is CalculatorAction.Reciprocal -> calculateReciprocal()
            is CalculatorAction.MemoryClear -> performMemoryClear()
            is CalculatorAction.MemoryRecall -> performMemoryRecall()
            is CalculatorAction.MemoryStore -> performMemoryStore()
            is CalculatorAction.MemoryAdd -> performMemoryAdd()
            is CalculatorAction.MemorySubtract -> performMemorySubtract()
            is CalculatorAction.Parentheses -> state = state.copy(showParentheses = !state.showParentheses)
            is CalculatorAction.Abs -> performAbs()
            is CalculatorAction.Acos -> performAcos()
            is CalculatorAction.Asin -> performAsin()
            is CalculatorAction.Atan -> performAtan()
            is CalculatorAction.Cbrt -> performCbrt()
            is CalculatorAction.Ceil -> performCeil()
            is CalculatorAction.Cos -> performCos()
            is CalculatorAction.Cosh -> performCosh()
            is CalculatorAction.Exp -> performExp()
            is CalculatorAction.Floor -> performFloor()
            is CalculatorAction.Log -> performLog()
            is CalculatorAction.Log10 -> performLog10()
            is CalculatorAction.Log2 -> performLog2()
            is CalculatorAction.Sin -> performSin()
            is CalculatorAction.Sinh -> performSinh()
            is CalculatorAction.Sqrt -> performSqrt()
            is CalculatorAction.Tan -> performTan()
            is CalculatorAction.Tanh -> performTanh()
        }
    }
//Advanced Functions
    private fun performAbs() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = number1.absoluteValue.toString())
        }
    }

    private fun performAcos() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = acos(number1).toString())
        }
    }
    private fun performAsin() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = asin(number1).toString())
        }
    }

    private fun performAtan() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = atan(number1).toString())
        }
    }

    private fun performCbrt() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = cbrt(number1).toString())
        }
    }

    private fun performCeil() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = kotlin.math.ceil(number1).toString())
        }
    }

    private fun performCos() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = kotlin.math.cos(number1).toString())
        }
    }

    private fun performCosh() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = cosh(number1).toString())
        }
    }

    private fun performExp() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = kotlin.math.exp(number1).toString())
        }
    }

    private fun performFloor() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = kotlin.math.floor(number1).toString())
        }
    }

    private fun performLog() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = ln(number1).toString())
        }
    }

    private fun performLog10() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = log10(number1).toString())
        }
    }

    private fun performLog2() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = log2(number1).toString())
        }
    }

    private fun performSin() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = sin(number1).toString())
        }
    }

    private fun performSinh() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = sinh(number1).toString())
        }
    }

    private fun performSqrt() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = sqrt(number1).toString())
        }
    }

    private fun performTan() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = tan(number1).toString())
        }
    }

    private fun performTanh() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            state = state.copy(number1 = tanh(number1).toString())
        }
    }



//Delete
    private fun performDeletion() {
        when {
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )

            state.operation != null -> state = state.copy(
                operation = null
            )

            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun toggleSign() {
        state = if (state.operation == null) {
            state.copy(
                number1 = toggleSign(state.number1)
            )
        } else {
            state.copy(
                number2 = toggleSign(state.number2)
            )
        }
    }

    private fun toggleSign(number: String): String {
        return if (number.startsWith("-")) {
            number.substring(1)
        } else {
            "-$number"
        }
    }

    private fun calculateSquareRoot() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            val result = sqrt(number1)
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun calculatePercentage() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if (number1 != null && number2 != null) {
            val result = number1 * (number2 / 100)
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }

    private fun calculateReciprocal() {
        val number1 = state.number1.toDoubleOrNull()
        if (number1 != null) {
            val result = 1 / number1
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }
//Memory Functions

    private fun performMemoryClear() {
        memoryValue = "0"
    }

    private fun performMemoryRecall() {
        state = if (state.operation == null) {
            state.copy(
                number1 = memoryValue
            )
        } else {
            state.copy(
                number2 = memoryValue
            )
        }
    }

    private fun performMemoryStore() {
        state = if (state.operation == null) {
            state.copy(
                number1 = memoryValue
            )
        } else {
            state.copy(
                number2 = memoryValue
            )
        }
    }

    private fun performMemoryAdd() {
        val currentValue = memoryValue.toDoubleOrNull()
        val number = if (state.operation == null) {
            state.number1.toDoubleOrNull()
        } else {
            state.number2.toDoubleOrNull()
        }
        if (currentValue != null && number != null) {
            memoryValue = (currentValue + number).toString().take(15)
        }
    }

    private fun performMemorySubtract() {
        val currentValue = memoryValue.toDoubleOrNull()
        val number = if (state.operation == null) {
            state.number1.toDoubleOrNull()
        } else {
            state.number2.toDoubleOrNull()
        }
        if (currentValue != null && number != null) {
            memoryValue = (currentValue - number).toString().take(15)
        }
    }






    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        if (number1 != null && number2 != null) {
            val result = when (state.operation) {
                is CalculatorOperation.Add -> number1 + number2
                is CalculatorOperation.Subtract -> number1 - number2
                is CalculatorOperation.Multiply -> number1 * number2
                is CalculatorOperation.Divide -> number1 / number2
                else -> return
            }
            state = state.copy(
                number1 = result.toString().take(15),
                number2 = "",
                operation = null
            )
        }
    }


    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".")
            && state.number1.isNotBlank()
        ) {
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }
        if(!state.number2.contains(".") && state.number2.isNotBlank()
        ) {
            state = state.copy(
                number1 = state.number2 + "."
            )
        }
    }

    private fun enterNumber(number: Int) {
        if(state.operation == null) {
            if(state.number1.length >= MAX_NUM_LENGTH) {
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH) {
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )
    }
    companion object {
        private const val MAX_NUM_LENGTH = 16
    }
}