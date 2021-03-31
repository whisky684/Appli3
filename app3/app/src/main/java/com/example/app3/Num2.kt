package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_num2.*

class Num2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num2)

        bta2.setOnClickListener {
            val nex = Intent(this , Num3::class.java)
            startActivity(nex)
        }
        btb2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btc2.setOnClickListener {
            val nex = Intent(this , Num3::class.java)
            startActivity(nex)
        }
        btd2.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
    }
}