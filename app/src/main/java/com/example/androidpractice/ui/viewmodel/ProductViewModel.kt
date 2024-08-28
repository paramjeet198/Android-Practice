package com.example.androidpractice.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidpractice.data.model.Product
import com.example.androidpractice.data.repository.ProductRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    val repository = ProductRepository()
    val productList = MutableLiveData<List<Product>>()

    init {
        products()
    }

    private fun products() {
        CoroutineScope(Dispatchers.Main).launch {
            productList.value = repository.addProductsToList()
        }
    }

}