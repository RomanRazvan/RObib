package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button2.setOnClickListener{
            startActivity(Intent(this, categoriiActivity::class.java))
        }
        trimite.setOnClickListener{
            startActivity(Intent(this, parolaActivity::class.java))
        }
    }
}