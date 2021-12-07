package com.example.ch8_2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.CompoundButton
import com.example.ch8_2.databinding.ActivityMainBinding

class MyEventHandler : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        Log.d("kkang", "체크박스1 클릭")
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.check1.setOnCheckedChangeListener(MyEventHandler())
        binding.check2.setOnCheckedChangeListener(MyEventHandler())
    }
}