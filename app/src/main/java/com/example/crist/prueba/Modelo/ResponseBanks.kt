package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class ResponseBanks : BaseModel() {

    @SerializedName("bankListResponse")
    var bankListResponse: Bank? = null

    class Bank : BaseModel() {

        @SerializedName("code")
        var code: String? = null
        @SerializedName("banks")
        var banks: Banks? = null
    }
}