package com.ndcoding.ndccalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ndcoding.ndccalculator.theme.White

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    ignoredOnClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(1.dp)
            .aspectRatio(1.5f)
            .background(Color.Transparent)
            .clickable { ignoredOnClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 26.sp,
            color = White,
            style = MaterialTheme.typography.h3
        )
    }
}

@Composable
fun RectangleCalculatorButton(
    symbol: String,
    modifier: Modifier = Modifier,
    ignoredOnClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth(0.1f) // Adjust the fillMaxWidth value to make the button wider
            .height(45.dp)
            .background(Color.Transparent, RoundedCornerShape(8.dp))
            .clickable { ignoredOnClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 32.sp,
            color = Color.White,
            style = MaterialTheme.typography.h4
        )
    }
}

@Composable
fun ScientificCalculatorButton(
    symbol: String,
    modifier: Modifier,
    ignoredOnClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(1.dp)
            .aspectRatio(1.5f)
            .background(Color.Transparent)
            .clickable { ignoredOnClick() }
            .then(modifier)
    ) {
        Text(
            text = symbol,
            fontSize = 15.sp,
            color = White,
            style = MaterialTheme.typography.h3
        )
    }
}
