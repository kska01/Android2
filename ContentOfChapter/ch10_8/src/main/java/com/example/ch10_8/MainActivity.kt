package com.example.ch10_8

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayOf<String>("사과", "복숭아", "딸기", "수박")
        AlertDialog.Builder(this).run {
            setTitle("items test")
            setIcon(android.R.drawable.ic_dialog_info)
            setItems(items, object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.d("kkang", "선택한 과일 : ${items[p1]}")
                }
            })
            setCancelable(false)
            setPositiveButton("닫기", null)
            show()
        }.setCanceledOnTouchOutside(false)
    }
}