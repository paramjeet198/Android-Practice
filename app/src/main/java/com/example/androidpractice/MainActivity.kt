package com.example.androidpractice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidpractice.databinding.ActivityMainBinding
import com.example.androidpractice.ui.adapter.ProductAdapter
import com.example.androidpractice.ui.viewmodel.ProductViewModel
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ProductViewModel
    private lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val tempViewModel: ProductViewModel by viewModels()
        viewModel = tempViewModel

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ProductAdapter(this, emptyList()) { product ->
            Snackbar.make(binding.root, "${product.description} ", Snackbar.LENGTH_SHORT).show()
        }
        binding.recyclerView.adapter = adapter

        loadProducts();
    }

    private fun loadProducts() {
        viewModel.productList.observe(this) {
            adapter.submitData(it)
        }

    }
}