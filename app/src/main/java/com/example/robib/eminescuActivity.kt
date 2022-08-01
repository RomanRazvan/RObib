package com.example.robib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class eminescuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eminescu)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}