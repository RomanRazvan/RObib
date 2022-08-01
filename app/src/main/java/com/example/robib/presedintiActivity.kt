package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.presedinti.*

class presedintiActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.presedinti)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        iliescu.setOnClickListener {
            startActivity(Intent(this, iliescuActivity::class.java))
        }

        iohannis.setOnClickListener {
            startActivity(Intent(this, iohannisActivity::class.java))
        }

        ceausescu.setOnClickListener {
            startActivity(Intent(this, ceausescuActivity::class.java))
        }

        basescu.setOnClickListener {
            startActivity(Intent(this, basescuActivity::class.java))
        }
    }
}