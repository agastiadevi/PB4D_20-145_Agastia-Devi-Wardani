package com.example.modul3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.Uri

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener{
            Intent(this, profil::class.java).also{
                startActivity(it)
            }
        }
        val button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val phoneNumber = "6285933710531"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=$phoneNumber"))
            startActivity(intent)
        }
    }
}
