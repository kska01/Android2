package com.example.ch9_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ch9_3.databinding.ActivityMain2Binding
import com.example.ch9_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.go.setOnClickListener {
            val binding2 = ActivityMain2Binding.inflate(layoutInflater)
            setContentView(binding2.root)
        }
    }
}