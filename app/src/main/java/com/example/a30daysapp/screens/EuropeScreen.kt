package com.example.a30daysapp.screens

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.a30daysapp.R
import com.example.a30daysapp.Screen

@Composable
fun ShowEurope(navController: NavController) {
    var selectedImageUri by remember { mutableStateOf<Uri?>(null) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "This is the Europe screen content.",
            style = TextStyle(
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        LoadPhotoButton { uri ->
            selectedImageUri = uri
        }
        selectedImageUri?.let { uri ->
            LoadedImage(uri = uri)
        }
        Spacer(modifier = Modifier.height(20.dp))
        StyledButton(R.string.back, Screen.MainMenu, navController)
    }
}

@Composable
fun LoadedImage(uri: Uri) {
    val painter = rememberImagePainter(uri)

    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier.size(200.dp)
    )
}

@Composable
fun LoadPhotoButton(onPhotoLoaded: (Uri) -> Unit) {
    val galleryLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val selectedImageUri = result.data?.data
            if (selectedImageUri != null) {
                onPhotoLoaded(selectedImageUri)
            }
        }
    }

    Button(
        onClick = {
            val intent = Intent(Intent.ACTION_PICK).apply {
                type = "image/*"
            }
            galleryLauncher.launch(intent)
        }
    ) {
        Text(text = "Load Photo")
    }
}