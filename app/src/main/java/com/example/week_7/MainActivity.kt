package com.example.week_7

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.week_7.Adapter.Adapter
import com.example.week_7.databinding.ActivityMainBinding
import com.example.week_7.model.Komputer

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var komputeradapter :Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showRecycler()
    }
    private fun showRecycler(){
            val data : MutableList<Komputer> = mutableListOf()
        data.add(Komputer(R.drawable.intel, "Prosesor", "gen11"))
        data.add(Komputer(R.drawable.vga, "Prosesor1", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor2", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor3", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor4", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor5", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor6", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor7", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor8", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor9", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor0", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor", "gen11"))
        data.add(Komputer(R.drawable.intel, "Prosesor", "gen11"))

        binding.RecycleView.apply{
            komputeradapter = Adapter(data)
            adapter = komputeradapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }


    }


}