package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.categorii.*

class categoriiActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.categorii)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        sportivi.setOnClickListener {
            startActivity(Intent(this, sportiviActivity::class.java))
        }

        domnitori.setOnClickListener {
            startActivity(Intent(this, domnitoriActivity::class.java))
        }


        presedinti.setOnClickListener { 
            startActivity(Intent( this, presedintiActivity::class.java))
        }

        muzica.setOnClickListener {
            startActivity(Intent( this, muzicaActivity::class.java))
        }

        scriitori.setOnClickListener {
            startActivity(Intent( this, scriitoriActivity::class.java))
        }

        actori.setOnClickListener {
            startActivity(Intent( this, actoriActivity::class.java))
        }

        altele.setOnClickListener {
            startActivity(Intent( this, alteleActivity::class.java))
        }

        adaugate.setOnClickListener {
            startActivity(Intent( this, RetriveDataInRecycleView::class.java))
        }

    }
}