package com.example.androidpractice.data.datasource

import com.example.androidpractice.data.model.Product
import com.google.android.material.animation.AnimatableView.Listener
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class ProductDataSource {

    // List of 15 products
    private val products = listOf(
        Product(
            id = 1,
            name = "Laptop",
            price = 1500,
            description = "A high-end laptop with powerful specs.",
            image = "laptop_image_url",
            isFav = false
        ),
        Product(
            id = 2,
            name = "Smartphone",
            price = 800,
            description = "A smartphone with a sleek design and great features.",
            image = "smartphone_image_url",
            isFav = true
        ),
        Product(
            id = 3,
            name = "Headphones",
            price = 200,
            description = "Noise-cancelling headphones with high-quality sound.",
            image = "headphones_image_url",
            isFav = false
        ),
        Product(
            id = 4,
            name = "Smartwatch",
            price = 250,
            description = "A stylish smartwatch with fitness tracking.",
            image = "smartwatch_image_url",
            isFav = true
        ),
        Product(
            id = 5,
            name = "Tablet",
            price = 600,
            description = "A tablet with a vibrant display and powerful performance.",
            image = "tablet_image_url",
            isFav = false
        ),
        Product(
            id = 6,
            name = "Gaming Console",
            price = 500,
            description = "A gaming console with immersive graphics.",
            image = "gaming_console_image_url",
            isFav = true
        ),
        Product(
            id = 7,
            name = "Bluetooth Speaker",
            price = 120,
            description = "A portable Bluetooth speaker with excellent sound quality.",
            image = "bluetooth_speaker_image_url",
            isFav = false
        ),
        Product(
            id = 8,
            name = "Camera",
            price = 900,
            description = "A digital camera with high-resolution image capture.",
            image = "camera_image_url",
            isFav = true
        ),
        Product(
            id = 9,
            name = "E-reader",
            price = 150,
            description = "An e-reader with a glare-free screen for easy reading.",
            image = "ereader_image_url",
            isFav = false
        ),
        Product(
            id = 10,
            name = "Wireless Earbuds",
            price = 180,
            description = "Wireless earbuds with noise cancellation and long battery life.",
            image = "wireless_earbuds_image_url",
            isFav = true
        ),
        Product(
            id = 11,
            name = "Monitor",
            price = 300,
            description = "A 4K monitor with stunning color accuracy.",
            image = "monitor_image_url",
            isFav = false
        ),
        Product(
            id = 12,
            name = "Keyboard",
            price = 100,
            description = "A mechanical keyboard with customizable backlighting.",
            image = "keyboard_image_url",
            isFav = true
        ),
        Product(
            id = 13,
            name = "Mouse",
            price = 70,
            description = "A wireless mouse with ergonomic design.",
            image = "mouse_image_url",
            isFav = false
        ),
        Product(
            id = 14,
            name = "External Hard Drive",
            price = 110,
            description = "An external hard drive with 2TB of storage.",
            image = "external_hard_drive_image_url",
            isFav = true
        ),
        Product(
            id = 15,
            name = "Router",
            price = 130,
            description = "A Wi-Fi router with high-speed connectivity.",
            image = "router_image_url",
            isFav = false
        )
    )


    suspend fun products(): List<Product> = withContext(Dispatchers.IO) {
        delay(1000)
        return@withContext products
    }

}