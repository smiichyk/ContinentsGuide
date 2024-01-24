package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.ui.theme.ContinentsGuide
import com.example.a30daysapp.screens.ShowMainButtons
import com.example.a30daysapp.screens.ShowEurope
import com.example.a30daysapp.screens.ShowAsia
import com.example.a30daysapp.screens.ShowAfrica
import com.example.a30daysapp.screens.ShowAmerica
import com.example.a30daysapp.screens.ShowOceania


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContinentsGuide {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main_screen") {
                    composable(Screen.MainMenu.route) {
                        ShowMainButtons(navController)
                    }
                    composable(Screen.Europe.route) {
                        ShowEurope(navController)
                    }
                    composable(Screen.Asia.route) {
                        ShowAsia(navController)
                    }
                    composable(Screen.Africa.route) {
                        ShowAfrica(navController)
                    }
                    composable(Screen.America.route) {
                        ShowAmerica(navController)
                    }
                    composable(Screen.Oceania.route) {
                        ShowOceania(navController)
                    }
                }
            }
        }
    }
}

sealed class Screen(val route: String) {
    object MainMenu : Screen("main_screen")
    object Europe : Screen("europe")
    object Asia : Screen("asia")
    object Africa : Screen("africa")
    object America : Screen("america")
    object Oceania : Screen("oceania")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContinentsGuide {
        ShowMainButtons(rememberNavController())
    }
}