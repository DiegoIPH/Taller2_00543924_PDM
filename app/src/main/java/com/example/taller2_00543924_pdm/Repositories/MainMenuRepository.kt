package com.example.taller2_00543924_pdm.Repositories

import com.example.taller2_00543924_pdm.Dummy.dummyRestaurant
import com.example.taller2_00543924_pdm.Model.Restaurant

interface RestaurantRepository{
    suspend fun getRestaurants(): List<Restaurant>
    suspend fun getRestaurantById(id: Int): Restaurant?
    suspend fun getRestaurantsByDish(query: String): List<Restaurant>
}

class RestaurantRepositoryImpl : RestaurantRepository {
    override suspend fun getRestaurants(): List<Restaurant> = dummyRestaurant

    override suspend fun getRestaurantById(id: Int): Restaurant? {
        return dummyRestaurant.find { it.id == id }
    }
    override suspend fun getRestaurantsByDish(query: String): List<Restaurant> {
        return dummyRestaurant.filter { restaurant ->
            restaurant.menu.any { dish ->
                dish.name.contains(query, ignoreCase = true)
            }
        }
    }
}