package com.example.taller2_00543924_pdm.Screen.MainMenu

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taller2_00543924_pdm.Model.Restaurant
import com.example.taller2_00543924_pdm.Repositories.RestaurantRepository
import com.example.taller2_00543924_pdm.Repositories.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainMenuViewModel : ViewModel(){
    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants = _restaurants.asStateFlow()

    private val repository: RestaurantRepository = RestaurantRepositoryImpl()

    init{
        loadRestaurants()
    }
    fun loadRestaurants(){
        viewModelScope.launch {
            _restaurants.value = repository.getRestaurants()
        }
    }
}