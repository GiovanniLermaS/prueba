package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class RequestBanks : BaseModel() {

    @SerializedName("language")
    var language: String? = null
    @SerializedName("command")
    var command: String? = null
    @SerializedName("merchant")
    var merchant = Merchant()
    @SerializedName("test")
    var test: Boolean? = null
    @SerializedName("bankListInformation")
    var bankListInformation = BankList()
}