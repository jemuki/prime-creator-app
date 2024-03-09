package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    val btn1 = findViewById<Button>(R.id.lognow)

        btn1.setOnClickListener{
            startActivity(Intent(applicationContext, home::class.java))
        }
    val btn2 = findViewById<TextView>(R.id.no2)
        btn2.setOnClickListener {
            startActivity(Intent(applicationContext, signup::class.java))
        }

    }//ends oncreate
}//ends class