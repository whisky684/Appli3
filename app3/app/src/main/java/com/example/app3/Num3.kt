package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_num3.*

class Num3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num3)


        bta3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btb3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btc3.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btd3.setOnClickListener {
            val nex = Intent(this , Num4::class.java)
            startActivity(nex)
        }
    }
}