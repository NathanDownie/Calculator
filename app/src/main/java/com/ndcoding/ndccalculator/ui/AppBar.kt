package com.ndcoding.ndccalculator.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
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

    val menuItems = listOf("Scientific Calculator", "Settings")

    Box(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 8.dp)
    ) {
        IconButton(
            onClick = { expandedState = !expandedState },
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                tint = Color.White
            )
        }

        Box(
            modifier = Modifier.align(Alignment.CenterStart)
        ) {
            DropdownMenu(
                expanded = expandedState,
                onDismissRequest = { expandedState = false },
                modifier = Modifier
                    .padding(start = 8.dp, top = 8.dp)
                    .background(Color.White, RoundedCornerShape(16.dp))
                    .align(Alignment.CenterEnd)
            ) {
                menuItems.forEachIndexed { index, item ->
                    DropdownMenuItem(
                        onClick = {
                            selectedIndex = index
                            expandedState = false

                            when (index) {
                                0 -> navController.navigate("Scientific")
                                1 -> navController.navigate("Settings")
                            }
                        }
                    ) {
                        Text(text = item)
                    }
                }
            }
        }
    }
}

















