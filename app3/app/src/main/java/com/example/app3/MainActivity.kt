package com.example.app3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bta1.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btb1.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }
        btc1.setOnClickListener {
            val nex = Intent(this , Num2::class.java)

            startActivity(nex)
        }
        btd1.setOnClickListener {
            Toast.makeText(this, "ตอบผิดกรุณาตอบใหม่", Toast.LENGTH_LONG).show()
            return@setOnClickListener
        }

    }
}