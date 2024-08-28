package com.example.androidpractice.data.model

data class Product(
    val id: Int,
    val name: String,
    val price: Int,
    val description: String,
    val image: String,
    val isFav: Boolean,
)
