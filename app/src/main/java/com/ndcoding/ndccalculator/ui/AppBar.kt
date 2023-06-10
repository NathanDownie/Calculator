package com.ndcoding.ndccalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CalculatorAppBar(navController: NavController) {
    var expandedState by remember { mutableStateOf(false) }
    var selectedIndex by remember { mutableIntStateOf(-1) }

    val menuItems = listOf("Calculator", "Scientific", "Settings")
    var pageTitle by remember { mutableStateOf("Calculator") }

    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .padding(top = 0.dp, bottom = 0.dp)
    ) {
        IconButton(
            onClick = { expandedState = !expandedState },
            modifier = Modifier
                .align(Alignment.CenterStart)
                .offset(y = (-10).dp)
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color.White
            )
        }
        Text(
            text = pageTitle,
            color = Color.White,
            modifier = Modifier.padding(start = 40.dp, top = 3.dp)
        )


        Box(
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            DropdownMenu(
                expanded = expandedState,
                onDismissRequest = { expandedState = false },
                modifier = Modifier
                    .padding(start = 8.dp, top = 8.dp)
                    .border(2.dp, Color.Green, shape = RoundedCornerShape(16.dp))
                    .background(Color.Black, RoundedCornerShape(16.dp))
                    .align(Alignment.CenterEnd)
            ) {
                menuItems.forEachIndexed { index, item ->
                    DropdownMenuItem(
                        onClick = {
                            selectedIndex = index
                            expandedState = false

                            when (index) {
                                0 -> {
                                    pageTitle = "Calculator"
                                    navController.navigate("Calculator")
                                }
                                1 -> {
                                    pageTitle = "Scientific"
                                    navController.navigate("Scientific")
                                }
                                2 -> {
                                    pageTitle = "Settings"
                                    navController.navigate("Settings")
                                }
                            }
                        }
                    ) {
                        Text(text = item, color = Color.White)
                    }
                }
            }
        }
    }
}


















