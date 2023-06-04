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
import com.ndcoding.ndccalculator.theme.Black
import com.ndcoding.ndccalculator.theme.Blue
import com.ndcoding.ndccalculator.theme.Green
import com.ndcoding.ndccalculator.theme.Purple
import com.ndcoding.ndccalculator.theme.Red
import com.ndcoding.ndccalculator.theme.Typography
import com.ndcoding.ndccalculator.theme.White
import com.ndcoding.ndccalculator.theme.Yellow

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 0.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Transparent)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
            ) {
                val expression = if (state.showParentheses) {
                    "(${state.number1}${state.operation?.symbol ?: ""}${state.number2})"
                } else {
                    "${state.number1}${state.operation?.symbol ?: ""}${state.number2}"
                }

                Text(
                    text = expression,
                    textAlign = TextAlign.End,
                    modifier = Modifier.padding(vertical = 32.dp),
                    style = Typography.h3,
                    fontWeight = FontWeight.Bold,
                    fontSize = 80.sp,
                    color = White,
                    maxLines = 2
                )



                Spacer(modifier = Modifier.weight(1f))


// Row 1
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(
                        symbol = "MC",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.MemoryClear) }
                    )
                    CalculatorButton(
                        symbol = "MR",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.MemoryRecall) }
                    )
                    CalculatorButton(
                        symbol = "MS",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.MemoryStore) }
                    )
                    CalculatorButton(
                        symbol = "M+",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.MemoryAdd) }
                    )
                    CalculatorButton(
                        symbol = "M-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Blue, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.MemorySubtract) }
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
                        onClick = { onAction(CalculatorAction.Delete) }
                    )
                    CalculatorButton(
                        symbol = "CE",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Clear) }
                    )
                    CalculatorButton(
                        symbol = "C",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Red, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Clear) }
                    )
                    CalculatorButton(
                        symbol = "+",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Add)) } //                     )

                    )
                    CalculatorButton(
                        symbol = "V",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.SquareRoot) }
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
                        onClick = { onAction(CalculatorAction.Number(7)) }
                    )
                    CalculatorButton(
                        symbol = "8",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(8)) }
                    )
                    CalculatorButton(
                        symbol = "9",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(9)) }
                    )
                    CalculatorButton(
                        symbol = "/",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Divide)) }
                    )
                    CalculatorButton(
                        symbol = "%",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Percentage) }
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
                        onClick = { onAction(CalculatorAction.Number(4)) }
                    )
                    CalculatorButton(
                        symbol = "5",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(5)) }
                    )
                    CalculatorButton(
                        symbol = "6",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(6)) }
                    )
                    CalculatorButton(
                        symbol = "X",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) }
                    )
                    CalculatorButton(
                        symbol = "1/x",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Reciprocal) }
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
                        onClick = { onAction(CalculatorAction.Number(1)) }
                    )
                    CalculatorButton(
                        symbol = "2",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(2)) }
                    )
                    CalculatorButton(
                        symbol = "3",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(3)) }
                    )
                    CalculatorButton(
                        symbol = "-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Yellow, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) }
                    )
                    CalculatorButton(
                        symbol = "+/-",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.ToggleSign) }
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
                        onClick = { onAction(CalculatorAction.Decimal) }
                    )
                    CalculatorButton(
                        symbol = "0",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Green, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Number(0)) }
                    )
                    CalculatorButton(
                        symbol = "()",
                        modifier = Modifier
                            .weight(1f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Parentheses) }
                    )

                    RectangleCalculatorButton(
                        symbol = "=",
                        modifier = Modifier.weight(2f)
                            .border(width = 2.dp, color = Purple, RoundedCornerShape(16.dp)),
                        onClick = { onAction(CalculatorAction.Calculate) }
                    )


                }


            }

        }
    }


}


@Preview(showSystemUi = false, showBackground = false)
@Composable
fun CalculatorPreview() {
val calculatorState = CalculatorState() // Provide an initial state for the calculator

Calculator(state = calculatorState) {
// Handle calculator actions
}
}



