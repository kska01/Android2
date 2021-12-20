package com.example.ch11_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ch11_4.databinding.ItemMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class MyViewHolder(val binding: ItemMainBinding): RecyclerView.ViewHolder(binding.root)

class MyAdapter(val binding: ItemMainBinding): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
     override fun getItemCount(): Int = datas.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        MyViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("kkang", "onBindViewHolder : $position")
        val binding = (holder as MyViewHolder).binding
        //뷰 데이터 출력
        binding.itemData.text = datas[position]
        //뷰 이벤트 추가
        binding.itemRoot.setOnClickListener {
            Log.d("kkang", "item root click : $position")
        }
    }
}