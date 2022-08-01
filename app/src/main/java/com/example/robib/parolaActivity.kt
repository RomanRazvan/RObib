package com.example.robib

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.altele.*
import kotlinx.android.synthetic.main.parola.*

class parolaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.parola)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        trimite.setOnClickListener {

            var parola = password.getText().toString()

            if(password.text.trim().isNotEmpty() && parola=="123") {
                startActivity(Intent(this, adaugareActivity::class.java))
            }else{
                Toast.makeText(this, "Parola greșită", Toast.LENGTH_LONG).show()
            }


        }
    }
}