package com.example.modul2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaBook = arrayOf("Cinderella","Kancil","Malin",
        "Snow White","Timun Mas", "Danau Toba",)

        val gambarBook = arrayOf(
            R.drawable.cinderella,
            R.drawable.kancil,
            R.drawable.malin,
            R.drawable.sw,
            R.drawable.timun,
            R.drawable.toba,
        )
        val bookAdapter = BookAdapter(namaBook, gambarBook)

        rv_book.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter=bookAdapter
        }
    }
}