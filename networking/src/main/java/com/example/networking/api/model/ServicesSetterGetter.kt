package com.example.networking.api.model

import com.example.networking.api.model.Data
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ServicesSetterGetter (
    @SerializedName("data")
    @Expose
    val data: Data? = null
)