package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_num5.*

class Num5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_num5)

        bta5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btb5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btc5.setOnClickListener {
            Toast.makeText(this, "ยินดีด้วยคุณตอบถูก", Toast.LENGTH_LONG).show()
            return@setOnClickListener

        }
        btd5.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btmain.setOnClickListener {
            val nex = Intent(this , MainActivity::class.java)
            startActivity(nex)
        }
    }
}