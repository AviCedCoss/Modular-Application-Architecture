package com.example.networking.api

import com.example.networking.api.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("index/getProfileFields")
    fun getServices(@Query("hashkey") hashkey : String,
                    @Query("vendor_id") vendor_id : Int )
            : Call<ServicesSetterGetter>

}