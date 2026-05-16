package com.example.taller2_00543924_pdm.Screen.RestaurantDetail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taller2_00543924_pdm.Repositories.RestaurantRepository
import com.example.taller2_00543924_pdm.Repositories.RestaurantRepositoryImpl
import com.example.taller2_00543924_pdm.Model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantDetailViewModel : ViewModel() {
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()

    private val _selectedRestaurant = MutableStateFlow<Restaurant?>(null)
    val selectedRestaurant = _selectedRestaurant.asStateFlow()

    fun loadSelectedRestaurant(restaurantId: Int){
        viewModelScope.launch {
            _selectedRestaurant.value = repository.getRestaurantById(restaurantId)
        }
    }
}