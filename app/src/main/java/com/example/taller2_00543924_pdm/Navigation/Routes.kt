package com.example.taller2_00543924_pdm.Navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey{
    @Serializable
    data object MainMenuScreen : Routes()
    @Serializable
    data class  RestaurantDetailScreen(val id : Int) : Routes()

    @Serializable
    data class  SearchedRestaurantScreen(val query : String) : Routes()
}