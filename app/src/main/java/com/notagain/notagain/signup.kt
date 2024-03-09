package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val btn = findViewById<Button>(R.id.signnow)
        btn.setOnClickListener{
            startActivity(Intent(applicationContext, login::class.java))
        }

        val btn2 = findViewById<TextView>(R.id.no1)
        btn2.setOnClickListener {
            startActivity(Intent(applicationContext, login::class.java))
        }
    }//ends oncreate
}//ends class