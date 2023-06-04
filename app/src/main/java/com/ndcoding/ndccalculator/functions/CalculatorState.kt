package com.ndcoding.ndccalculator.functions

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null,
    val showParentheses: Boolean = false
)