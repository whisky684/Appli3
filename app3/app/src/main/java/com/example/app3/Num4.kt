package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_num4.*

class Num4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num4)

        bta4.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btb4.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btc4.setOnClickListener {
            val nex = Intent(this , Num5::class.java)
            startActivity(nex)

        }
        btd4.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
    }
}