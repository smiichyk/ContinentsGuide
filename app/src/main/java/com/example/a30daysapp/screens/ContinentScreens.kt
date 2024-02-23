package com.example.a30daysapp.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen
import com.example.a30daysapp.ShowContinent

@Composable
fun EuropeScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.europe,
        textId = R.string.europe_text,
        screen = Screen.EuropeQuiz
    )
}

@Composable
fun AsiaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.asia,
        textId = R.string.asia_text,
        screen = Screen.AsiaQuiz
    )
}

@Composable
fun AfricaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.africa,
        textId = R.string.africa_text,
        screen = Screen.AfricaQuiz
    )
}

@Composable
fun AmericaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.america,
        textId = R.string.america_text,
        screen = Screen.AmericaQuiz
    )
}

@Composable
fun OceaniaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.oceania,
        textId = R.string.oceania_text,
        screen = Screen.OceaniaQuiz
    )
}