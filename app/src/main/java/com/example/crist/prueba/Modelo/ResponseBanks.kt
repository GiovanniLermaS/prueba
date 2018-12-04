package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class ResponseBanks : BaseModel() {

    @SerializedName("code")
    var code: String? = null
    @SerializedName("error")
    var error: String? = null
    @SerializedName("banks")
    var banks = ArrayList<Banks>()
}