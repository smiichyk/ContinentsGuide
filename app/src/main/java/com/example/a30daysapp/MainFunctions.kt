package com.example.a30daysapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun StyledButton(textId: Int, destination: Screen, navController: NavController) {
    Button(
        onClick = { navController.navigate(destination.route) },
        colors = ButtonDefaults.buttonColors(containerColor = Color(165, 115, 105)),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, Color.LightGray),
    ) {
        Text(
            text = stringResource(id = textId),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
    }
}

@Composable
fun ShowContinent(navController: NavController, imageInt: Int, textId: Int, continentQuiz: Screen) {
    Column(
        modifier = Modifier
            .background(Color(225, 200, 150))
            .padding(30.dp)
    ) {
        Image(
            painterResource(imageInt),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 30.dp)
        )
        Text(
            stringResource(textId),
        )
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            StyledButton(R.string.quiz, continentQuiz, navController)
            StyledButton(R.string.back, Screen.MainMenu, navController)
        }
    }
}

@Composable
fun ContinentQuiz(navController: NavController) {
    val answers = remember { mutableStateListOf<String>() }

    Column(
        modifier = Modifier.padding(30.dp)
    ) {
        Text(
            text = stringResource(R.string.quiz),
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        // Answer Inputs
        AnswerInput(R.string.europe_question01) { answer ->
            answers[0] = answer
        }

        AnswerInput(R.string.europe_question02) { answer ->
            answers[1] = answer
        }

        AnswerInput(R.string.europe_question03) { answer ->
            answers[2] = answer
        }

        AnswerInput(R.string.europe_question04) { answer ->
            answers[3] = answer
        }

        AnswerInput(R.string.europe_question05) { answer ->
            answers[4] = answer
        }

        // Submit
        Spacer(modifier = Modifier.height(32.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = {
                    answers.forEachIndexed { index, answer ->
                        println("Question ${index + 1} Answer: $answer")
                    }
                }
            ) {
                Text(text = stringResource(id = R.string.submit))
            }

            StyledButton(R.string.back, Screen.Europe, navController)
        }
    }
}

@Composable
fun AnswerInput(questionResId: Int, onAnswerChanged: (String) -> Unit) {
    var answer by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        Text(
            text = stringResource(questionResId),
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        OutlinedTextField(
            value = answer,
            onValueChange = { answer = it; onAnswerChanged(answer) },
            label = { Text("Your Answer") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}
