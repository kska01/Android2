package com.example.ch10_7

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayOf<String>("사과", "복숭아", "수박", "딸기")
        AlertDialog.Builder(this).run {
            setSingleChoiceItems(items, 1, object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Log.d("kkang", "${items[p1]} 이 선택되었습니다.")
                }
            })
            setPositiveButton("닫기", null)
            show()
        }
    }
}