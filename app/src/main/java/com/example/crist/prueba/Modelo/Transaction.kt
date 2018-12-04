package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class Transaction : BaseModel() {

    @SerializedName("order")
    var order: Order? = null
    @SerializedName("payer")
    var payer: Payer? = null
    @SerializedName("extraParameters")
    var extraParameters: ExtraParameters? = null
    @SerializedName("type")
    var type: String? = null
    @SerializedName("paymentMethod")
    var paymentMethod: String? = null
    @SerializedName("paymentCountry")
    var paymentCountry: String? = null
    @SerializedName("ipAddress")
    var ipAddress: String? = null
    @SerializedName("cookie")
    var cookie: String? = null
    @SerializedName("userAgent")
    var userAgent: String? = null
}