package com.ndcoding.ndccalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ndcoding.ndccalculator.theme.NDCCalculatorTheme
import com.ndcoding.ndccalculator.ui.Calculator
import com.ndcoding.ndccalculator.ui.CalculatorAppBar
import com.ndcoding.ndccalculator.ui.ScientificCalculator
import com.ndcoding.ndccalculator.ui.Settings
import com.ndcoding.ndccalculator.viewmodel.CalculatorViewModel


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.Black.toArgb()

        setContent {
            NDCCalculatorTheme {
                val navController = rememberNavController()
                val viewModel = viewModel<CalculatorViewModel>()
                val state = viewModel.state
                val buttonSpacing = 2.dp

                NavHost(navController, startDestination = "Calculator") {
                    composable("Calculator") {
                        Calculator(
                            state = state,
                            ignoredOnAction = viewModel::onAction,
                            buttonSpacing = buttonSpacing,
                        )
                    }
                    composable("Scientific") {
                        ScientificCalculator(
                            state = state,
                            ignoredOnAction = viewModel::onAction,
                            buttonSpacing = buttonSpacing,
                        )
                    }
                    composable("Settings") {
                        Settings()
                    }
                }
                Column {
                    CalculatorAppBar(navController = navController)
                    NavHost(navController, startDestination = "Calculator") {
                        composable("Calculator") {
                            Calculator(
                                state = state,
                                ignoredOnAction = viewModel::onAction,
                                buttonSpacing = buttonSpacing,
                            )
                        }
                        composable("Calculator") {
                            Calculator(
                                state = state,
                                ignoredOnAction = viewModel::onAction,
                                buttonSpacing = buttonSpacing,
                            )
                        }
                        composable("Scientific") {
                            ScientificCalculator(
                                state = state,
                                ignoredOnAction = viewModel::onAction,
                                buttonSpacing = buttonSpacing,
                            )
                        }
                        composable("Settings") {
                            Settings()
                        }
                    }
                }
            }
        }
    }
}

























