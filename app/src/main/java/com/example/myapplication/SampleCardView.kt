package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.PetaniAdapter
import com.example.myapplication.model.Petani

class SampleCardView : AppCompatActivity() {
    lateinit  var cvSample : RecyclerView
    lateinit var petaniAdapter : PetaniAdapter
    lateinit var cPetani : List<Petani>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_card_view)
        cvSample = findViewById(R.id.rvCardView)

        cPetani = listOf(
            Petani(user = "R1", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R2", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R3", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40"),
            Petani(user = "R4", nama = "Kristina", jumlahLahan = "100", identifikasi = "50", tambahLahan = "40")
        )
        petaniAdapter = PetaniAdapter(cPetani)

        cvSample.apply{
            layoutManager = LinearLayoutManager(this@SampleCardView)
            adapter = petaniAdapter
        }

    }
}