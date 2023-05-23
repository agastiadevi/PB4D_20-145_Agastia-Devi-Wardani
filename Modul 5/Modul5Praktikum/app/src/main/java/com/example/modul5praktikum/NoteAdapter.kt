package com.example.modul5praktikum

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.modul5praktikum.databinding.ItemNoteBinding

class NoteAdapter(private val list: ArrayList<NoteLists>) : RecyclerView.Adapter<NoteAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false))
    }

    override fun onBindViewHolder(holder: NoteAdapter.MainViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemNoteBinding.bind(itemView)
        fun bind(data: NoteLists) {
            binding.tvItemDate.text = data.tanggal
            binding.tvItemTitle.text = data.judul
            binding.tvItemDescription.text = data.deskripsi
        }

    }
}