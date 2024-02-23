package com.example.a30daysapp.quizes

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a30daysapp.ContinentQuiz
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen
import com.example.a30daysapp.ui.theme.ContinentsGuide

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
        ),
        listOf(
            R.string.answer_11,
            R.string.answer_12,
            R.string.answer_13,
            R.string.answer_14,
            R.string.answer_15
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
        ),
        listOf(
            R.string.answer_21,
            R.string.answer_22,
            R.string.answer_23,
            R.string.answer_24,
            R.string.answer_25
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
        ),
        listOf(
            R.string.answer_31,
            R.string.answer_32,
            R.string.answer_33,
            R.string.answer_34,
            R.string.answer_35
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
        ),
        listOf(
            R.string.answer_41,
            R.string.answer_42,
            R.string.answer_43,
            R.string.answer_44,
            R.string.answer_45
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
        ),
        listOf(
            R.string.answer_51,
            R.string.answer_52,
            R.string.answer_53,
            R.string.answer_54,
            R.string.answer_55
        )
    )
}

@Preview(showBackground = true)
@Composable
fun EuropeQuizPreview() {
    ContinentsGuide {
        EuropeQuiz(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AsiaQuizPreview() {
    ContinentsGuide {
        AsiaQuiz(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AfricaQuizPreview() {
    ContinentsGuide {
        AfricaQuiz(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun AmericaQuizPreview() {
    ContinentsGuide {
        AmericaQuiz(rememberNavController())
    }
}

@Preview(showBackground = true)
@Composable
fun OceaniaQuizPreview() {
    ContinentsGuide {
        OceaniaQuiz(rememberNavController())
    }
}