package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class BankList : BaseModel() {

    @SerializedName("paymentMethod")
    var paymentMethod: String? = null
    @SerializedName("paymentCountry")
    var paymentCountry: String? = null
}