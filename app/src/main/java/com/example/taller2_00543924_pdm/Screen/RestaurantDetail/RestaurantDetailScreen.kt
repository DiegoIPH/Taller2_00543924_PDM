package com.example.taller2_00543924_pdm.Screen.RestaurantDetail

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleLeft
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import androidx.compose.foundation.lazy.items

@Composable
fun RestaurantDetailScreen(
    restaurantId: Int,
    navigateBack: () -> Unit,
    viewModel: RestaurantDetailViewModel = viewModel()
) {
    val context = LocalContext.current
    val restaurantDetail by viewModel.selectedRestaurant.collectAsState()
    LaunchedEffect(Unit) {
        viewModel.loadSelectedRestaurant(restaurantId)
    }
    Scaffold(
        topBar = {
            Column(
                modifier = Modifier
                    .windowInsetsPadding(WindowInsets.safeDrawing)
                    .padding(16.dp)
            ) {
                Row() {
                    IconButton(
                        onClick = { navigateBack() }
                    ){
                        Icon(
                            imageVector = Icons.Default.ArrowCircleLeft,
                            contentDescription = "Volver",
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    restaurantDetail?.let { restaurant ->
                        Text(text = restaurant.name, style = MaterialTheme.typography.headlineLarge)
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                restaurantDetail?.let { restaurant ->
                    Text(text = restaurant.description)
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    ) { padding ->
        restaurantDetail?.let { restaurant ->
                LazyColumn(modifier = Modifier
                    .padding(padding),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    items(restaurant.menu) { dish ->
                        Card(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row() {
                                AsyncImage(
                                    model = dish.imageUrl,
                                    contentDescription = "Imagen del platillo",
                                    modifier = Modifier
                                        .size(width = 80.dp, height = 120.dp)
                                        .clip(RoundedCornerShape(8.dp)),
                                        contentScale = ContentScale.Crop
                                )
                                Column(modifier = Modifier.padding(12.dp)) {
                                    Text(text = dish.name, style = MaterialTheme.typography.titleMedium)
                                    Text(text = dish.description, style = MaterialTheme.typography.bodySmall)
                                    Button(onClick = {Toast.makeText(
                                        context,
                                        "Se ha agregado ${dish.name} al carrito!",
                                        Toast.LENGTH_SHORT
                                    ).show()},
                                            colors = ButtonDefaults.buttonColors(
                                            containerColor = Color.Cyan)) {
                                        Text(text = "+ Agregar al carrito",
                                            fontWeight = FontWeight.Bold,)
                                    }
                                }
                            }
                        }
                    }
                }
            }
    }
}