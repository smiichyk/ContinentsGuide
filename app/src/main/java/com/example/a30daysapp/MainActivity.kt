package com.example.a30daysapp

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.quizes.AfricaQuiz
import com.example.a30daysapp.quizes.AmericaQuiz
import com.example.a30daysapp.quizes.AsiaQuiz
import com.example.a30daysapp.quizes.EuropeQuiz
import com.example.a30daysapp.quizes.OceaniaQuiz
import com.example.a30daysapp.screens.AfricaScreen
import com.example.a30daysapp.screens.AmericaScreen
import com.example.a30daysapp.screens.AsiaScreen
import com.example.a30daysapp.screens.EuropeScreen
import com.example.a30daysapp.screens.OceaniaScreen
import com.example.a30daysapp.screens.ShowMainButtons
import com.example.a30daysapp.ui.theme.ContinentsGuide

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
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
                        EuropeScreen(navController)
                    }
                    composable(Screen.EuropeQuiz.route) {
                        EuropeQuiz(navController)
                    }
                    composable(Screen.Asia.route) {
                        AsiaScreen(navController)
                    }
                    composable(Screen.AsiaQuiz.route) {
                        AsiaQuiz(navController)
                    }
                    composable(Screen.Africa.route) {
                        AfricaScreen(navController)
                    }
                    composable(Screen.AfricaQuiz.route) {
                        AfricaQuiz(navController)
                    }
                    composable(Screen.America.route) {
                        AmericaScreen(navController)
                    }
                    composable(Screen.AmericaQuiz.route) {
                        AmericaQuiz(navController)
                    }
                    composable(Screen.Oceania.route) {
                        OceaniaScreen(navController)
                    }
                    composable(Screen.OceaniaQuiz.route) {
                        OceaniaQuiz(navController)
                    }
                    composable("${Screen.Result.route}/{correctCount}") {
                            navBackStackEntry ->
                        val count = navBackStackEntry
                            .arguments?.getString("correctCount")?.toIntOrNull() ?: 0
                        ResultScreen(navController, count)
                    }
                }
            }
        }
    }
}

sealed class Screen(val route: String) {
    object MainMenu : Screen("main_screen")
    object Europe : Screen("europe")
    object EuropeQuiz : Screen("europe_quiz")
    object Asia : Screen("asia")
    object AsiaQuiz : Screen("asia_quiz")
    object Africa : Screen("africa")
    object AfricaQuiz : Screen("africa_quiz")
    object America : Screen("america")
    object AmericaQuiz : Screen("america_quiz")
    object Oceania : Screen("oceania")
    object OceaniaQuiz : Screen("oceania_quiz")
    object Result : Screen("Your result is")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContinentsGuide {
        ShowMainButtons(rememberNavController())
    }
}