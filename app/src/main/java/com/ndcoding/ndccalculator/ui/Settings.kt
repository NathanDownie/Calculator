package com.ndcoding.ndccalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ndcoding.ndccalculator.theme.Black

@Composable
fun Settings() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .background(Color.Transparent)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Colour",
                        color = Color.White,
                        style = MaterialTheme.typography.h6
                    )

                }
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = "Language ",
                        color = Color.White,
                        style = MaterialTheme.typography.h6
                    )

                }
                Button(
                    onClick = { /* Handle button click */ },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = " Spare",
                        color = Color.White,
                        style = MaterialTheme.typography.h6
                    )

                }
            }
        }
    }
}











