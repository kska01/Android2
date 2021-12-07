package com.example.ch8_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.example.ch8_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.check1.setOnCheckedChangeListener(this)
        binding.check2.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("kkang", "체크박스 클릭")
    }
}