package com.example.taller2_00543924_pdm.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.taller2_00543924_pdm.Screen.RestaurantDetail.RestaurantDetailScreen
import com.example.taller2_00543924_pdm.Screen.MainMenu.MainMenuScreen
import  com.example.taller2_00543924_pdm.Screen.SearchedRestaurant.SearchedRestaurantScreen


@Composable
fun App(){
    val backStack = rememberNavBackStack(Routes.MainMenuScreen)
    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.MainMenuScreen>{
                MainMenuScreen(
                    navigateToRestaurantDeatilScreen = { id ->
                        backStack.add(Routes.RestaurantDetailScreen(id = id))
                    },
                    onSearchClick = { search ->
                        backStack.add(Routes.SearchedRestaurantScreen(query = search))
                    }
                )
            }
            entry<Routes.RestaurantDetailScreen>{route ->
                RestaurantDetailScreen(
                    restaurantId = route.id,
                    navigateBack = {
                        backStack.removeLastOrNull()
                    }
                )
            }
            entry<Routes.SearchedRestaurantScreen>{value ->
                SearchedRestaurantScreen(
                    query = value.query,
                    navigateBack = {
                        backStack.removeLastOrNull()
                    },
                    navigateToRestaurantDeatilScreen = { id ->
                        backStack.add(Routes.RestaurantDetailScreen(id = id))
                    }
                )
            }
        }
    )
}