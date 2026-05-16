package com.example.taller2_00543924_pdm.Model

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
)
data class Restaurant(
    var id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)