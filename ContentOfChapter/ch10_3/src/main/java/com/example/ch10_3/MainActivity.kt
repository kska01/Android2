package com.example.ch10_3

import android.annotation.TargetApi
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @RequiresApi(Build.VERSION_CODES.R)
        fun showToast() {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                val toast = Toast.makeText(this, "종료하려면 한 번 더 누르세요.", Toast.LENGTH_SHORT)
                toast.addCallback(
                    object : Toast.Callback() {
                        override fun onToastHidden() {
                            super.onToastHidden()
                            Log.d("kkang", "toast hidden")
                        }

                        override fun onToastShown() {
                            super.onToastShown()
                            Log.d("kkang", "toast shown")
                        }
                    })
                toast.show()
            }
        }
        showToast()
    }
}