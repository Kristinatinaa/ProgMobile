package com.example.myapplication.model

import com.google.gson.annotations.SerializedName

class ResponseMhs (
    @field:SerializedName("ResponseMhs")
    val responseAddMahasiswa: List<ResponseMhsItem?>? = null
    )

    data class ResponseMhsItem(

        @field:SerializedName("nim")
        val nim: String? = null,

        @field:SerializedName("nama")
        val nama: String? = null,

        @field:SerializedName("foto")
        val foto: String? = null,

        @field:SerializedName("id")
        val id: Int? = null,

        @field:SerializedName("email")
        val email: String? = null,

        @field:SerializedName("alamat")
        val alamat: String? = null,

        @field:SerializedName("nim_progmob")
        val nim_progmob: String? = null

    )