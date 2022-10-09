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


        petaniAdapter = PetaniAdapter(lPetani)

        rvSample.apply{
            layoutManager = LinearLayoutManager(this@SampleRecyclerView)
            adapter = petaniAdapter
        }

    }
}