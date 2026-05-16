package com.example.taller2_00543924_pdm.Screen.MainMenu

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.taller2_00543924_pdm.Components.RestaurantItem
import androidx.compose.foundation.lazy.items

@Composable
fun MainMenuScreen(
    navigateToRestaurantDeatilScreen: (Int) -> Unit,
    onSearchClick: (String) -> Unit,
    viewModel: MainMenuViewModel = viewModel()
) {
    val restaurant by viewModel.restaurants.collectAsState()
    var search by rememberSaveable { mutableStateOf("") }

    val categories = rememberSaveable(restaurant) {
        restaurant.flatMap { it.categories }.distinct()
    }

    LaunchedEffect(Unit) {
        viewModel.loadRestaurants()
    }

    Scaffold(topBar = {
        Column(modifier = Modifier
            .windowInsetsPadding(WindowInsets.safeDrawing)) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = search,
                    onValueChange = { search = it },
                    modifier = Modifier.weight(1f),
                    placeholder = { Text("FoodSpot") },
                    trailingIcon = {
                        IconButton(
                            onClick = {
                                if (search.isNotBlank()) {
                                    onSearchClick(search)
                                }
                            }
                        ){
                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Lupa de búsqueda vacía",
                                modifier = Modifier.size(64.dp),
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                    }
                )
            }
        }
    }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(categories) { category ->
                val filteredRestaurants = restaurant.filter { it.categories.contains(category) }

                if (filteredRestaurants.isNotEmpty()) {
                    Column {
                        Text(
                            text = category,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )
                        LazyRow(
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            items(filteredRestaurants) { item ->
                                RestaurantItem(
                                    restaurant = item,
                                    onClick = { navigateToRestaurantDeatilScreen(item.id) }
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}