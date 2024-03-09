package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.squareup.picasso.Picasso

class profile : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val tohome = findViewById<ImageButton>(R.id.prohome)
        tohome.setOnClickListener {
            startActivity(Intent(applicationContext, home::class.java))
        }

        val  tosubs = findViewById<ImageButton>(R.id.prosubs)
        tosubs.setOnClickListener {
            startActivity(Intent(applicationContext, subs::class.java))
        }

        val tonot = findViewById<ImageButton>(R.id.pronot)
        tonot.setOnClickListener {
            startActivity(Intent(applicationContext, notification::class.java))
        }

        val topro = findViewById<ImageButton>(R.id.propro)
        topro.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }


//        fix the images
        val img1 = findViewById<ImageView>(R.id.dp1)
        Picasso.with(applicationContext).load(R.drawable.creator).fit().into(img1)

        val img2 = findViewById<ImageView>(R.id.dp2)
        Picasso.with(applicationContext).load(R.drawable.creator).fit().into(img2)


        val img3 = findViewById<ImageView>(R.id.underimg)
        Picasso.with(applicationContext).load(R.drawable.jemuki1).fit().into(img3)
//done images

        val toed = findViewById<CardView>(R.id.toedit)
        toed.setOnClickListener {
            startActivity(Intent(applicationContext, edit::class.java))
        }

        val set = findViewById<ImageButton>(R.id.toset)
        set.setOnClickListener {
            startActivity(Intent(applicationContext, settings::class.java))
        }



    }//ends oncreate
}//ends class