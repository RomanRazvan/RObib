package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sportivi.*

class sportiviActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sportivi)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        hagi.setOnClickListener {
            startActivity(Intent(this, hagiActivity::class.java))
        }

        pope.setOnClickListener {
            startActivity(Intent(this, popeActivity::class.java))
        }
        comaneci.setOnClickListener {
            startActivity(Intent(this, comaneciActivity::class.java))
        }

        halep.setOnClickListener {
            startActivity(Intent(this, halepActivity::class.java))
        }
    }
}