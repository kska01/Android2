package com.example.recyclerview1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview1.databinding.ItemLayoutBinding

class CustomAdapter: RecyclerView.Adapter<Holder>() {
    var listData = mutableListOf<Menu>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val menu = listData.get(position)
        holder.setMenu(menu)
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class Holder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
    fun setMenu(menu: Menu) {
        binding.menuName.text = "${menu.menuName}"
        binding.foodImage.setImageResource(menu.menuImage)
    }
}