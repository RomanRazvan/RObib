package com.example.robib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class nicolaescuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nicolaescu)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}