package com.example.taller2_00543924_pdm.Screen.SearchedRestaurant

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taller2_00543924_pdm.Model.Restaurant
import com.example.taller2_00543924_pdm.Repositories.*
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class SearchedRestaurantViewModel : ViewModel() {
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()

    private val _searchResults = MutableStateFlow<List<Restaurant>>(emptyList())
    val searchResults = _searchResults.asStateFlow()

    fun searchByDish(query: String) {
        viewModelScope.launch {
            _searchResults.value = repository.getRestaurantsByDish(query)
        }
    }
}