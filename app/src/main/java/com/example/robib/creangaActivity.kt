package com.example.robib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class creangaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.creanga)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}