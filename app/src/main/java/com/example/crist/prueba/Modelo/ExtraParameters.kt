package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class ExtraParameters : BaseModel() {

    @SerializedName("RESPONSE_URL")
    var RESPONSE_URL: String? = null
    @SerializedName("PSE_REFERENCE1")
    var PSE_REFERENCE1: String? = null
    @SerializedName("FINANCIAL_INSTITUTION_CODE")
    var FINANCIAL_INSTITUTION_CODE: String? = null
    @SerializedName("USER_TYPE")
    var USER_TYPE: String? = null
    @SerializedName("PSE_REFERENCE2")
    var PSE_REFERENCE2: String? = null
    @SerializedName("PSE_REFERENCE3")
    var PSE_REFERENCE3: String? = null
}