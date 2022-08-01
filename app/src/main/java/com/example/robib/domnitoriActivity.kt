package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.domnitori.*
import kotlinx.android.synthetic.main.sportivi.*

class domnitoriActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.domnitori)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        batran.setOnClickListener {
            startActivity(Intent(this, batranActivity::class.java))
        }

        cuza.setOnClickListener {
            startActivity(Intent(this, cuzaActivity::class.java))
        }

        viteazul.setOnClickListener {
            startActivity(Intent(this, viteazulActivity::class.java))
        }

        tepes.setOnClickListener {
            startActivity(Intent(this, tepesActivity::class.java))
        }

    }
}