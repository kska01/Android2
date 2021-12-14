package com.example.ch10_9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.ch10_9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        AlertDialog.Builder(this).run {
            setTitle("Input")
            setView(binding.root)
            setPositiveButton("닫기",null)
            show()
        }
    }
}