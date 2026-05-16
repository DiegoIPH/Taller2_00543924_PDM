package com.example.taller2_00543924_pdm.Components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun Image(url: String){
    AsyncImage(
        model=url,
        contentDescription = "Imagen del vocaloid",
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp),
        contentScale = ContentScale.Crop
    )
}