package com.notagain.notagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.squareup.picasso.Picasso

class edit : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val back = findViewById<ImageButton>(R.id.edtoback)
        back.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }


        val eddp = findViewById<ImageView>(R.id.editdp)
        val eddp2 = findViewById<ImageView>(R.id.editdp2)

        Picasso.with(applicationContext).load(R.drawable.creator).fit().into(eddp)
        Picasso.with(applicationContext).load(R.drawable.creator).fit().into(eddp2)


        val homee = findViewById<ImageButton>(R.id.edithome)
        val notez = findViewById<ImageButton>(R.id.editnot)
        val subse = findViewById<ImageButton>(R.id.editsubs)
        val proe =  findViewById<ImageButton>(R.id.editpro)

        homee.setOnClickListener {
            startActivity(Intent(applicationContext, home::class.java))
        }
        notez.setOnClickListener {
            startActivity(Intent(applicationContext, notification::class.java))
        }
        subse.setOnClickListener {
            startActivity(Intent(applicationContext, subs::class.java))
        }
        proe.setOnClickListener {
            startActivity(Intent(applicationContext, profile::class.java))
        }



    }//ends oncreate
}//ends class