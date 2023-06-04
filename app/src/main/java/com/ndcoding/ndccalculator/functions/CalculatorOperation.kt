package com.ndcoding.ndccalculator.functions

sealed class CalculatorOperation(val ignoredSymbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}
