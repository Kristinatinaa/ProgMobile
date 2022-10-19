package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.PetaniAdapter
import com.example.myapplication.model.Petani

class SampleRecyclerView : AppCompatActivity() {
    lateinit  var rvSample : RecyclerView
    lateinit var petaniAdapter : PetaniAdapter
    lateinit var lPetani : List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_recycler_view)
        rvSample = findViewById(R.id.rvLatihan)

        lPetani = listOf(
            Petani(user = "R1", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R2", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R3", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R4", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40")
        )
        petaniAdapter = PetaniAdapter(lPetani)

        rvSample.apply{
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }

    }
}