package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvMain : TextView
    lateinit var btnInput : Button
    lateinit var edNama : EditText
    lateinit var btHelp : Button
    lateinit var btnCardView: Button
    lateinit var btnRecyclerView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tv_main_activity)
        tvMain.text =getString(R.string.text_progmob_main)

        btnInput = findViewById(R.id.btn_ambil_nama)
        edNama = findViewById(R.id.ed_input_nama)
        btHelp = findViewById(R.id.btn_help)


        btnInput.setOnClickListener(View.OnClickListener { view ->
            var strTmp = edNama.text.toString()
            tvMain.text = strTmp
        })
        btHelp.setOnClickListener(View.OnClickListener { view ->
            var bundle = Bundle()
            var strTmp = edNama.text.toString()
            bundle.putString("tesText",strTmp)

            var intent = Intent(
                this@MainActivity,
                HelpActivity::class.java)
            startActivity(intent)
            finish()
        })
        btnCardView = findViewById(R.id.btnCardView)
        btnRecyclerView = findViewById(R.id.btnSampleRV)

        btnCardView.setOnClickListener(View.OnClickListener{view->
            var intent = Intent(this@MainActivity,SampleCardView::class.java)
            startActivity(intent)
        })
        btnRecyclerView.setOnClickListener(View.OnClickListener{view->
            var intent = Intent(this@MainActivity,SampleRecyclerView::class.java)
            startActivity(intent)
        })
}
}