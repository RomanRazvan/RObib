package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.altele.*

class alteleActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.altele)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        brancus.setOnClickListener {
            startActivity(Intent(this, brancusActivity::class.java))
        }
    }
}