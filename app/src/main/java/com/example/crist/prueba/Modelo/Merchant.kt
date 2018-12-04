package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class Merchant : BaseModel() {

    @SerializedName("apiLogin")
    var apiLogin: String? = null
    @SerializedName("apiKey")
    var apiKey: String? = null
}