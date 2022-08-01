package com.example.robib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class radulescuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.radulescu)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}