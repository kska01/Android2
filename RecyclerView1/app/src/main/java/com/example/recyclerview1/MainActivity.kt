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
        data.add(Menu(R.drawable.menu1, "명란젓"))
        data.add(Menu(R.drawable.menu2, "어리굴젓"))
        data.add(Menu(R.drawable.menu3, "오징어젓"))
        data.add(Menu(R.drawable.menu4, "낙지젓"))
        data.add(Menu(R.drawable.menu5, "가리비젓"))
        data.add(Menu(R.drawable.menu6, "갈치속젓"))

        return data
    }
}