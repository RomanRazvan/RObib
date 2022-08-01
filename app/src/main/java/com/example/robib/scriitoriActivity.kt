package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.scriitori.*

class scriitoriActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scriitori)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        eminescu.setOnClickListener {
            startActivity(Intent(this, eminescuActivity::class.java))
        }

        creanga.setOnClickListener {
            startActivity(Intent(this, creangaActivity::class.java))
        }

        blaga.setOnClickListener {
            startActivity(Intent(this, blagaActivity::class.java))
        }

        caragiale.setOnClickListener {
            startActivity(Intent(this, caragialeActivity::class.java))
        }
    }
}