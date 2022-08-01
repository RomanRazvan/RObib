package com.example.robib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ceausescuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ceausescu)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}