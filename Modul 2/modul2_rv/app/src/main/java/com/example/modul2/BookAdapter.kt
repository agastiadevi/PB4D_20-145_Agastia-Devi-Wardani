package com.example.modul2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter (val namaBook : Array<String>, val gambarBook : Array<Int>) :
    RecyclerView.Adapter<BookAdapter.MyViewHolder> (){
    class MyViewHolder(view : View) :RecyclerView.ViewHolder(view) {
        val tvBook = view.findViewById<TextView>(R.id.item_cinderella)
        val imgBook = view.findViewById<ImageView>(R.id.item_img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent,
        false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return  namaBook.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.tvBook.text= namaBook[position]
        holder.imgBook.setImageResource(gambarBook[position])
    }
}