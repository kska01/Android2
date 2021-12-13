package com.example.ch10_6

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
            setTitle("items test")
            setIcon(android.R.drawable.ic_dialog_info)
            setMultiChoiceItems(items, booleanArrayOf(true, false, true, false), object : DialogInterface.OnMultiChoiceClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int, p2: Boolean) {
                    Log.d("kkang", "${items[p1]}이 ${if(p2) "선택되었습니다." else "선택 해제되었습니다."}")
                }
            })
            setPositiveButton("닫기", null)
            show()
        }
    }
}