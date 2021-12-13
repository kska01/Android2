package com.example.ch10_4

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eventHandler = object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                if (p1 == DialogInterface.BUTTON_POSITIVE) {
                    Log.d("kkang", "positive button click")
                } else if (p1 == DialogInterface.BUTTON_NEGATIVE) {
                    Log.d("kkang", "negative button click")
                } else {
                    Log.d("kkang", "neutral button click")
                }
            }
        }

        AlertDialog.Builder(this).run {
            setTitle("test dialog")
            setIcon(android.R.drawable.ic_dialog_info)
            setMessage("정말 종료하시겠습니까?")
//            setPositiveButton("Ok", null)
//            setNegativeButton("Cancel", null)
            setNeutralButton("More", eventHandler)
            setPositiveButton("Yes", eventHandler)
            setNegativeButton("No", eventHandler)
            show()
       }
    }
}