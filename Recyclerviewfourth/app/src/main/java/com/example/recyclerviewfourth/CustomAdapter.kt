package com.example.recyclerviewfourth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewfourth.databinding.ItemLayoutBinding

class CustomAdapter: RecyclerView.Adapter<Holder>() {
    var listData: MutableList<Menu> = mutableListOf()

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
class Holder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun setMenu(menu: Menu) {
        binding.menuImg.setImageResource(menu.image)
        binding.menuName.text = "${menu.name}"
    }
}