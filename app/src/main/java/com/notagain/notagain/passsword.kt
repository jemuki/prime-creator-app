package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class passsword : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passsword)


        val back = findViewById<ImageButton>(R.id.passtosec)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, security::class.java))
        }

    }//ends oncreate
}//ends class