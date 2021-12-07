package com.example.ch8_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ch8_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.check1.setOnCheckedChangeListener { compoundButton, b ->
            Log.d("kkang", "체크박스1 클릭")
        }
        binding.check2.setOnCheckedChangeListener { compoundButton, b ->
            Log.d("kkang","체크박스2 클릭")
        }
    }
}