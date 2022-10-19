package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ServiceActivity : AppCompatActivity() {
    lateinit var btnGetAPI: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)
        btnGetAPI = findViewById(R.id.btnGetAPI)

        btnGetAPI.setOnClickListener(View.OnClickListener{view->
            var intent = Intent(this@ServiceActivity,SampleRecyclerView::class.java)
            startActivity(intent)
        })
    }
}
