package com.example.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data:MutableList<Menu> = loadData()

        var adapter = CustomAdapter()
        adapter.listData = data

        binding.recyclerView.adapter = adapter

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    fun loadData(): MutableList<Menu> {
        val data: MutableList<Menu> = mutableListOf()
        data[0] = Menu(R.drawable.menu1, R.string.menu1)
        data[1] = Menu(R.drawable.menu2, R.string.menu2)
        data[2] = Menu(R.drawable.menu3, R.string.menu3)
        data[3] = Menu(R.drawable.menu4, R.string.menu4)
        data[4] = Menu(R.drawable.menu5, R.string.menu5)
        data[5] = Menu(R.drawable.menu6, R.string.menu6)

        return data
    }
}