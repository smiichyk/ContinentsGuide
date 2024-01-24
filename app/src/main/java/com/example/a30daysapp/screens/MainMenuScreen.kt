package com.example.a30daysapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen


@Composable
fun ShowMainButtons(navController: NavController) {
    Box(modifier = Modifier) {
        ImageBackground()

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround,
        ) {
            StyledButton(R.string.europe, Screen.Europe, navController)
            StyledButton(R.string.asia, Screen.Asia, navController)
            StyledButton(R.string.africa, Screen.Africa, navController)
            StyledButton(R.string.north_and_south_america, Screen.America, navController)
            StyledButton(R.string.oceania_and_more_exotic_countries, Screen.Oceania, navController)
        }
    }
}

@Composable
fun ImageBackground() {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .background(color = Color(140, 160, 180))
            .fillMaxSize()
    ){
        val aspectRatio = 20f / 8f

        StyledImage(
            backgroundImage = R.drawable.europe,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .aspectRatio(aspectRatio)
        )
        StyledImage(
            backgroundImage = R.drawable.asia,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .aspectRatio(aspectRatio)
        )
        StyledImage(
            backgroundImage = R.drawable.africa,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .aspectRatio(aspectRatio)
        )
        StyledImage(
            backgroundImage = R.drawable.america,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .aspectRatio(aspectRatio)
        )
        StyledImage(
            backgroundImage = R.drawable.oceania,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .aspectRatio(aspectRatio)
        )
    }
}

@Composable
fun StyledButton(textId: Int, destination: Screen, navController: NavController) {
    Button(
        onClick = { navController.navigate(destination.route) },
        colors = ButtonDefaults.buttonColors(containerColor = Color(165, 115, 105)),
        shape = RoundedCornerShape(12.dp),
        border = BorderStroke(1.dp, Color.LightGray)
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
fun StyledImage(modifier: Modifier, backgroundImage: Int) {
    Image(
        painter = painterResource(id = backgroundImage),
        modifier = modifier,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}