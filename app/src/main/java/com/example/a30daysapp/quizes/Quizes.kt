package com.example.a30daysapp.quizes

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a30daysapp.ContinentQuiz
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen

@Composable
fun EuropeQuiz(navController: NavController) {
    ContinentQuiz(
        navController,
        Screen.Europe,
        listOf(
            R.string.question_11,
            R.string.question_12,
            R.string.question_13,
            R.string.question_14,
            R.string.question_15
        )
    )
}

@Composable
fun AsiaQuiz(navController: NavController) {
    ContinentQuiz(
        navController,
        Screen.Asia,
        listOf(
            R.string.question_21,
            R.string.question_22,
            R.string.question_23,
            R.string.question_24,
            R.string.question_25
        )
    )
}

@Composable
fun AfricaQuiz(navController: NavController) {
    ContinentQuiz(
        navController,
        Screen.Africa,
        listOf(
            R.string.question_31,
            R.string.question_32,
            R.string.question_33,
            R.string.question_34,
            R.string.question_35
        )
    )
}

@Composable
fun AmericaQuiz(navController: NavController) {
    ContinentQuiz(
        navController,
        Screen.America,
        listOf(
            R.string.question_41,
            R.string.question_42,
            R.string.question_43,
            R.string.question_44,
            R.string.question_45
        )
    )
}

@Composable
fun OceaniaQuiz(navController: NavController) {
    ContinentQuiz(
        navController,
        Screen.Oceania,
        listOf(
            R.string.question_51,
            R.string.question_52,
            R.string.question_53,
            R.string.question_54,
            R.string.question_55
        )
    )
}