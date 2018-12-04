package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class Payer : BaseModel() {

    @SerializedName("fullName")
    var fullName: String? = null
    @SerializedName("emailAddress")
    var emailAddress: String? = null
    @SerializedName("contactPhone")
    var contactPhone: String? = null
}