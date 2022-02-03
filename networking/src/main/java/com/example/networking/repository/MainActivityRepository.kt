package com.example.networking.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.networking.api.RetrofitClient
import com.example.networking.api.model.ServicesSetterGetter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {

    private val serviceSetterGetter = MutableLiveData<ServicesSetterGetter>()


    fun getServicesApiCall(): MutableLiveData<ServicesSetterGetter> {
        val call = RetrofitClient.apiInterface.getServices(
            "rNRccT7K6NVaZ6wgvsuLEUMow22IPYqp"
            ,1
        )
        call.enqueue(object: Callback<ServicesSetterGetter> {
            override fun onFailure(call: Call<ServicesSetterGetter>, t: Throwable) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", t.message.toString())
            }
            override fun onResponse(
                call: Call<ServicesSetterGetter>,
                response: Response<ServicesSetterGetter>
            ) {
                // TODO("Not yet implemented")
                Log.v("DEBUG : ", response.body().toString())

            }
        })

        return serviceSetterGetter
    }
}