package com.example.androidpractice.data.repository

import com.example.androidpractice.data.datasource.ProductDataSource
import com.example.androidpractice.data.model.Product

class ProductRepository {
    private var productDataStorage = ProductDataSource()
    suspend fun addProductsToList() : List<Product> = productDataStorage.products()
}