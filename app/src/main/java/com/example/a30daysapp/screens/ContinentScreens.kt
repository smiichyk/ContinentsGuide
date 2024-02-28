package com.example.a30daysapp.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen
import com.example.a30daysapp.ShowContinent
import com.example.a30daysapp.ui.theme.ContinentsGuide

@Composable
fun EuropeScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.europe,
        titleId = R.string.europe_title,
        textId = R.string.europe_text,
        screen = Screen.EuropeQuiz
    )
}

@Composable
fun AsiaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.asia,
        titleId = R.string.asia_title,
        textId = R.string.asia_text,
        screen = Screen.AsiaQuiz
    )
}

@Composable
fun AfricaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.africa,
        titleId = R.string.africa_title,
        textId = R.string.africa_text,
        screen = Screen.AfricaQuiz
    )
}

@Composable
fun AmericaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.america,
        titleId = R.string.america_title,
        textId = R.string.america_text,
        screen = Screen.AmericaQuiz
    )
}

@Composable
fun OceaniaScreen(navController: NavController) {
    ShowContinent(
        navController = navController,
        imageInt = R.drawable.oceania,
        titleId = R.string.oceania_title,
        textId = R.string.oceania_text,
        screen = Screen.OceaniaQuiz
    )
}

@Preview(showBackground = true)
@Composable
fun EuropePreview() {
    ContinentsGuide {
        EuropeScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AsiaPreview() {
    ContinentsGuide {
        AsiaScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AfricaPreview() {
    ContinentsGuide {
        AfricaScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AmericaPreview() {
    ContinentsGuide {
        AmericaScreen(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun OceaniaPreview() {
    ContinentsGuide {
        OceaniaScreen(rememberNavController())
    }
}