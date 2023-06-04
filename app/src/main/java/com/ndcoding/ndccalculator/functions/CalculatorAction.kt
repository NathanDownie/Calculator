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
}

