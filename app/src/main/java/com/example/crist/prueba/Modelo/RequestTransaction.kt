package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class RequestTransaction : BaseModel() {

    @SerializedName("language")
    var language: String? = null
    @SerializedName("command")
    var command: String? = null
    @SerializedName("merchant")
    var merchant: Merchant? = null
    @SerializedName("transaction")
    var transaction: Transaction? = null
    @SerializedName("test")
    var test: Boolean? = null
}