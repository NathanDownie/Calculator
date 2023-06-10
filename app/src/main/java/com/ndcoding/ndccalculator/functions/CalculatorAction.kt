package com.ndcoding.ndccalculator.functions

sealed class CalculatorAction {
    data class Number(val number: Int): CalculatorAction()
    object Clear: CalculatorAction()
    object Delete: CalculatorAction()
    object Decimal: CalculatorAction()
    object Calculate: CalculatorAction()
    object ToggleSign: CalculatorAction()
    object SquareRoot: CalculatorAction()
    object Percentage: CalculatorAction()
    object Reciprocal: CalculatorAction()
    object Parentheses: CalculatorAction()
    data class Operation(val operation: CalculatorOperation): CalculatorAction()

    // Memory Actions
    object MemoryClear: CalculatorAction()
    object MemoryRecall: CalculatorAction()
    object MemoryStore: CalculatorAction()
    object MemoryAdd: CalculatorAction()
    object MemorySubtract: CalculatorAction()

    // Scientific Functions
    object Abs: CalculatorAction()
    object Acos: CalculatorAction()
    object Asin: CalculatorAction()
    object Atan: CalculatorAction()
    object Cbrt: CalculatorAction()
    object Ceil: CalculatorAction()
    object Cos: CalculatorAction()
    object Cosh: CalculatorAction()
    object Exp: CalculatorAction()
    object Floor: CalculatorAction()
    object Log: CalculatorAction()
    object Log2: CalculatorAction()
    object Log10: CalculatorAction()
    object Sin: CalculatorAction()
    object Sinh: CalculatorAction()
    object Sqrt: CalculatorAction()
    object Tan: CalculatorAction()
    object Tanh: CalculatorAction()
}

