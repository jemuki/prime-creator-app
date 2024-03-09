package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class security : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_security)



        val back = findViewById<ImageButton>(R.id.sectoset)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, settings::class.java))
        }

        val top1 = findViewById<ConstraintLayout>(R.id.topass)
        top1.setOnClickListener {
            startActivity(Intent(applicationContext, passsword::class.java))
        }
        val top2 = findViewById<ConstraintLayout>(R.id.totwo)
        top2.setOnClickListener {

        }

        val top3 = findViewById<ConstraintLayout>(R.id.todelete)
        top3.setOnClickListener {

        }

    }//ends oncreate
}//ends class