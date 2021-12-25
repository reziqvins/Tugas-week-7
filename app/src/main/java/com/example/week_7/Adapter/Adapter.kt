package com.example.week_7.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.week_7.databinding.LayoutitemComputerBinding
import com.example.week_7.model.Komputer

class Adapter (private val komputer: MutableList<Komputer>): RecyclerView.Adapter<Adapter.komputerViewHolder>() {
    inner class  komputerViewHolder( val binding: LayoutitemComputerBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): komputerViewHolder {
        return komputerViewHolder(LayoutitemComputerBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: komputerViewHolder, position: Int) {
        holder.binding.apply {
            intel1.text = komputer[position].judul
            cpu.setImageResource( komputer[position].gambar)
            detail.text = komputer [position].spesifik
        }
    }

    override fun getItemCount(): Int {
        return komputer.size
    }
}