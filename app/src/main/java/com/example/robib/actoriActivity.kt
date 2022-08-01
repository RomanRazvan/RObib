package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.actori.*

class actoriActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actori)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        caragiu.setOnClickListener {
            startActivity(Intent(this, caragiuActivity::class.java))
        }

        pelea.setOnClickListener {
            startActivity(Intent(this, peleaActivity::class.java))
        }

        radulescu.setOnClickListener {
            startActivity(Intent(this, radulescuActivity::class.java))
        }

        nicolaescu.setOnClickListener {
            startActivity(Intent(this, nicolaescuActivity::class.java))
        }
    }
}