package com.example.testapi

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.PUT


interface ApiInterface {
    @GET("data/all")
    fun getData(): Call<MyDataItem>

    @FormUrlEncoded
    @PUT("data/update/1")
    fun putData(@Body data: MyDataItem): Call<MyDataItem>
}