package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MahasiswaActivity : AppCompatActivity() {
    lateinit var InsertData: Button
    lateinit var GetData : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mahasiswa)

        InsertData = findViewById(R.id.InsertData)
        GetData = findViewById(R.id.GetData)

        InsertData.setOnClickListener(View.OnClickListener{ view->
            var intent = Intent(this@MahasiswaActivity,MahasiswaInsert::class.java)
            startActivity(intent)
        })
        GetData.setOnClickListener(View.OnClickListener{ view->
            var intent = Intent(this@MahasiswaActivity,GetAPIActivity::class.java)
            startActivity(intent)
        })
    }
}