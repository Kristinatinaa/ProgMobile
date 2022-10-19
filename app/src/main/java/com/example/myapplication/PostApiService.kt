package com.example.myapplication

import com.example.myapplication.model.ResponseMhs
import com.example.myapplication.model.ResponseMhsItem
import com.example.myapplication.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostApiService {
    fun addMhs(req: ResponseMhsItem, onResult: (ResponseMhs) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.addMhs(req).enqueue(
            object : Callback<ResponseMhs> {
                override fun onFailure(call: Call<ResponseMhs>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseMhs>, response: Response<ResponseMhs>){
                    val addedMhs = response.body()
                    if (addedMhs != null) {
                        onResult(addedMhs)
                    }
                }
            }
        )
    }
}