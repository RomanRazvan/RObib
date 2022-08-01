package com.example.robib

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.muzica.*

class muzicaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.muzica)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        andra.setOnClickListener {
            startActivity(Intent(this, andraActivity::class.java))
        }

        bittman.setOnClickListener {
            startActivity(Intent(this, bittmanActivity::class.java))
        }

        chirila.setOnClickListener {
            startActivity(Intent(this, chirilaActivity::class.java))
        }

        delia.setOnClickListener {
            startActivity(Intent(this, deliaActivity::class.java))
        }

    }
}