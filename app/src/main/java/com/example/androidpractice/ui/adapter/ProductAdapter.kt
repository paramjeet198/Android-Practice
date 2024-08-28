package com.example.androidpractice.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidpractice.data.model.Product
import com.example.androidpractice.databinding.CardDesignBinding
import com.google.android.material.snackbar.Snackbar

class ProductAdapter(
    val mContext: Context,
    var mdata: List<Product>,
    private val onItemClick: (Product) -> Unit,
) :
    RecyclerView.Adapter<ProductAdapter.ItemViewHolder>() {

    fun submitData(mdata: List<Product>) {
        this.mdata = mdata
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding: CardDesignBinding =
            CardDesignBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return mdata.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val product = mdata[position]
        holder.binding.name.text = product.name
        holder.binding.textViewPrice.text = product.price.toString()
//        holder.binding.imageViewProduct.setImageURI()

//        holder.binding.cardViewProduct.setOnClickListener {
//            Snackbar.make(it, "${product.description} ", Snackbar.LENGTH_SHORT).show()
//        }

        // Handle item click
        holder.binding.cardViewProduct.setOnClickListener {
            onItemClick(product)
        }
    }

    class ItemViewHolder(val binding: CardDesignBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}