package com.example.crist.prueba.Modelo

import android.content.Context
import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

@Suppress("UNCHECKED_CAST")
data class ResponseRetrofit(
    @SerializedName("ResponseCode") val responseCode: Int,
    @SerializedName("ResponseMessage") val responseMessage: String,
    @SerializedName("ResponseData") val responseData: kotlin.Any?
) {
    fun getObject(type: Class<out BaseModel>): BaseModel? {
        return BaseModel().objectFromJson(Gson().toJson(responseData), type)
    }

    fun getArrayObject(type: Class<out BaseModel>): MutableList<out BaseModel?> {
        return BaseModel().arrayFromJson(Gson().toJson(responseData), type)
    }
}

