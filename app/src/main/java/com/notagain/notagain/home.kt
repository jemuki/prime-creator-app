package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.squareup.picasso.Picasso

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val img1 = findViewById<ImageView>(R.id.im1)
        Picasso.with(applicationContext).load(R.drawable.mkuru).fit().into(img1)

        val img2 = findViewById<ImageView>(R.id.im2)
        Picasso.with(applicationContext).load(R.drawable.nastyc).fit().into(img2)


        val tohome = findViewById<ImageButton>(R.id.homebtn1)
        tohome.setOnClickListener {
            finish();
            startActivity(Intent(applicationContext, home::class.java))

        }

        val notifi = findViewById<ImageButton>(R.id.tonot)
        notifi.setOnClickListener {
            startActivity(Intent(applicationContext, notification::class.java))
        }

        val  d = 1

        val tosubs = findViewById<ImageButton>(R.id.tosubs)
        tosubs.setOnClickListener {
            startActivity(Intent(applicationContext, subs::class.java))
        }

        val topro = findViewById<ImageButton>(R.id.topro)
        topro.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }

    }//ends on create
}//ends class