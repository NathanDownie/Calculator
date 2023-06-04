package com.ndcoding.ndccalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ndcoding.ndccalculator.functions.CalculatorAction
import com.ndcoding.ndccalculator.functions.CalculatorOperation
import com.ndcoding.ndccalculator.functions.CalculatorState
import com.ndcoding.ndccalculator.theme.Blue
import com.ndcoding.ndccalculator.theme.Green
import com.ndcoding.ndccalculator.theme.Purple
import com.ndcoding.ndccalculator.theme.Red
import com.ndcoding.ndccalculator.theme.Typography
import com.ndcoding.ndccalculator.theme.Yellow

@Composable
fun ScientificCalculator(
    state: CalculatorState,
    buttonSpacing: Dp = 0.dp,
    ignoredOnAction: (CalculatorAction) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Black)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                val expression = if (state.showParentheses) {
                    "(${state.number1}${state.operation?.ignoredSymbol ?: ""}${state.number2})"
                } else {
                    "${state.number1}${state.operation?.ignoredSymbol ?: ""}${state.number2}"
                }

                Text(
                    text = expression,
                    textAlign = TextAlign.End,
                    style = Typography.h3,
                    fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,
                    color = Color.White,
                    modifier = Modifier.wrapContentWidth()
                )



                Spacer(modifier = Modifier.weight(1f))
                // Row 1
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    ScientificCalculatorButton(
                        symbol = "abs",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Delete) }
                    )
                    ScientificCalculatorButton(
                        symbol = "acos",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "asin",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "atan",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Add)) } //                     )

                    )
                    ScientificCalculatorButton(
                        symbol = "cbrt",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                    ScientificCalculatorButton(
                        symbol = "ceil",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                }
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    ScientificCalculatorButton(
                        symbol = "cos",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Delete) }
                    )
                    ScientificCalculatorButton(
                        symbol = "cosh",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "exp",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "floor",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Add)) } //                     )

                    )
                    ScientificCalculatorButton(
                        symbol = "log",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                    ScientificCalculatorButton(
                        symbol = "log2",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                }
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    ScientificCalculatorButton(
                        symbol = "log10",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Delete) }
                    )
                    ScientificCalculatorButton(
                        symbol = "sin",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "sinh",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    ScientificCalculatorButton(
                        symbol = "sqrt",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Add)) } //                     )

                    )
                    ScientificCalculatorButton(
                        symbol = "tan",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                    ScientificCalculatorButton(
                        symbol = "tanh",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                }
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "MC",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.MemoryClear) }
                    )
                    CalculatorButton(
                        symbol = "MR",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.MemoryRecall) }
                    )
                    CalculatorButton(
                        symbol = "MS",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.MemoryStore) }
                    )
                    CalculatorButton(
                        symbol = "M+",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.MemoryAdd) }
                    )
                    CalculatorButton(
                        symbol = "M-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.MemorySubtract) }
                    )
                }

// Row 2
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "DEL",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Delete) }
                    )
                    CalculatorButton(
                        symbol = "CE",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    CalculatorButton(
                        symbol = "C",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Clear) }
                    )
                    CalculatorButton(
                        symbol = "+",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Add)) } //                     )

                    )
                    CalculatorButton(
                        symbol = "V",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.SquareRoot) }
                    )
                }

// Row 3
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "7",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(7)) }
                    )
                    CalculatorButton(
                        symbol = "8",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(8)) }
                    )
                    CalculatorButton(
                        symbol = "9",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(9)) }
                    )
                    CalculatorButton(
                        symbol = "/",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Divide)) }
                    )
                    CalculatorButton(
                        symbol = "%",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Percentage) }
                    )
                }

// Row 4
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "4",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(4)) }
                    )
                    CalculatorButton(
                        symbol = "5",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(5)) }
                    )
                    CalculatorButton(
                        symbol = "6",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(6)) }
                    )
                    CalculatorButton(
                        symbol = "X",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) }
                    )
                    CalculatorButton(
                        symbol = "1/x",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Reciprocal) }
                    )
                }

// Row 5
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "1",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(1)) }
                    )
                    CalculatorButton(
                        symbol = "2",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(2)) }
                    )
                    CalculatorButton(
                        symbol = "3",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(3)) }
                    )
                    CalculatorButton(
                        symbol = "-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) }
                    )
                    CalculatorButton(
                        symbol = "+/-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.ToggleSign) }
                    )
                }

// Row 6
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = ".",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Decimal) }
                    )
                    CalculatorButton(
                        symbol = "0",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Number(0)) }
                    )
                    CalculatorButton(
                        symbol = "()",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Parentheses) }
                    )

                    RectangleCalculatorButton(
                        symbol = "=",
                        modifier = Modifier.weight(2f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        ignoredOnClick = { ignoredOnAction(CalculatorAction.Calculate) }
                    )


                }


            }

        }
    }


}


@Preview(showSystemUi = false, showBackground = false)
@Composable
fun ScientificCalculatorPreview() {
    val calculatorState = CalculatorState() // Provide an initial state for the calculator

    Calculator(state = calculatorState) {
// Handle calculator actions
    }
}
