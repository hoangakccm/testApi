package com.example.testapi

import retrofit2.Call
import retrofit2.http.*


interface ApiInterface {

    @GET("data")
    fun getData(): Call<MyDataItem>

    @PUT("data")
    fun putData(@Body myDataItem: MyDataItem): Call<MyDataItem>

    @POST("update")
    fun postData(@Body myDataItem: MyDataItem): Call<MyDataItem>
}