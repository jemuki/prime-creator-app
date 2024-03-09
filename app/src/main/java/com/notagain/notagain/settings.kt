package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout

class settings : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val back = findViewById<ImageButton>(R.id.settoback)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }

        val back2 = findViewById<ConstraintLayout>(R.id.backtooprof)
        back2.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }

        val sec = findViewById<ConstraintLayout>(R.id.tosecu)
        sec.setOnClickListener {
            startActivity(Intent(applicationContext, security::class.java))
        }

        val not = findViewById<ConstraintLayout>(R.id.tonotx)
        not.setOnClickListener {
            startActivity(Intent(applicationContext, notification::class.java))
        }

        val disp =findViewById<ConstraintLayout>(R.id.todisp)
        disp.setOnClickListener {
            startActivity(Intent(applicationContext, pdisplay::class.java))
        }



    }//ends oncreate
}//ends class