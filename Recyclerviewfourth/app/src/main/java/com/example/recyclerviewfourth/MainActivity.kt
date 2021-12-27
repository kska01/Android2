package com.example.recyclerviewfourth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewfourth.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data: MutableList<Menu> = loadData()
        val adapter = CustomAdapter()
        adapter.listData = data

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
    fun loadData(): MutableList<Menu> {
        var data: MutableList<Menu> = mutableListOf(
            Menu(R.drawable.menu1, "명란젓"),
            Menu(R.drawable.menu2, "어리굴젓"),
            Menu(R.drawable.menu3, "오징어젓"),
            Menu(R.drawable.menu4, "낙지젓"),
            Menu(R.drawable.menu5, "가리비젓"),
            Menu(R.drawable.menu6, "갈치쌈장")
        )

        return data
    }
}