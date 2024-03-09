package com.notagain.notagain

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)



        val back = findViewById<ImageButton>(R.id.nottoback)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, home::class.java))
        }

        val tohome = findViewById<ImageButton>(R.id.homebtnnot)
        tohome.setOnClickListener {
            startActivity(Intent(applicationContext, home::class.java))
        }

        val tonot = findViewById<ImageButton>(R.id.tonotnot)
        tonot.setOnClickListener {
            startActivity(Intent(applicationContext, notification::class.java))
        }

        val tosubs = findViewById<ImageButton>(R.id.tosubsnot)
        tosubs.setOnClickListener {
            startActivity(Intent(applicationContext, subs::class.java))
        }

        val topro = findViewById<ImageButton>(R.id.topronot)
        topro.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }

    }//ends oncraete
}//ends class