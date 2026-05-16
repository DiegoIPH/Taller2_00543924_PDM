package com.example.taller2_00543924_pdm.Screen.SearchedRestaurant

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.taller2_00543924_pdm.Components.RestaurantItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleLeft
import androidx.compose.material.icons.filled.Search
import androidx.compose.foundation.lazy.items

@Composable
fun SearchedRestaurantScreen(
    navigateBack: () -> Unit,
    navigateToRestaurantDeatilScreen: (Int) -> Unit,
    query: String,
    viewModel: SearchedRestaurantViewModel = viewModel()
) {
    var currentQuery by rememberSaveable { mutableStateOf(query) }
    val results by viewModel.searchResults.collectAsState()

    LaunchedEffect(currentQuery) {
        viewModel.searchByDish(currentQuery)
    }

    Scaffold { padding ->
        Column(modifier = Modifier.fillMaxSize().padding(padding)) {
            Row(modifier = Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
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
                OutlinedTextField(
                    value = currentQuery,
                    onValueChange = { currentQuery = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
            }
            if (results.isEmpty()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Lupa de búsqueda vacía",
                        modifier = Modifier.size(64.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "No se encontraron resultados.",
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }else{
                LazyColumn(
                    modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(results) { restaurant ->
                        RestaurantItem(
                            restaurant = restaurant,
                            onClick = {
                                navigateToRestaurantDeatilScreen(restaurant.id)
                            }
                        )
                    }
                }
            }
        }
    }
}