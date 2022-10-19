package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.model.ResponseMhsItem

class MahasiswaInsert : AppCompatActivity() {
    lateinit var txtnim : EditText
    lateinit var txtnama : EditText
    lateinit var txtemail : EditText
    lateinit var txtalamat: EditText
    lateinit var txtnimprog : EditText
    lateinit var txtfoto : EditText
    lateinit var btnsub : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mahasiswa_insert)
        txtnim = findViewById(R.id.txtnim)
        txtnama = findViewById(R.id.txtnama)
        txtemail = findViewById(R.id.txtemail)
        txtalamat = findViewById(R.id.txtalamat)
        txtnimprog = findViewById(R.id.txtnimprog)
        txtfoto = findViewById(R.id.txtfoto)
        btnsub = findViewById(R.id.btnsub)

        btnsub.setOnClickListener(View.OnClickListener { view ->
            val nim = txtnim.text.toString()
            val nama = txtnama.text.toString()
            val email = txtemail.text.toString()
            val alamat = txtalamat.text.toString()
            val nim_progmob = txtnimprog.text.toString()
            val foto = txtfoto.text.toString()

            val postservice = PostApiService()
            val MhsData = ResponseMhsItem(id = null,
                nim = nim, nama = nama, email = email, foto = foto, alamat = alamat, nim_progmob = nim_progmob)

            postservice.addMhs(MhsData){
                if(ResponseMhsItem().id != null){
                    println("Success")
                }else{
                    println("error")
                }
            }
        })
    }
}