package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class Order : BaseModel() {

    @SerializedName("accountId")
    var accountId: String? = null
    @SerializedName("referenceCode")
    var referenceCode: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("language")
    var language: String? = null
    @SerializedName("signature")
    var signature: String? = null
    @SerializedName("notifyUrl")
    var notifyUrl: String? = null
    @SerializedName("additionalValues")
    var additionalValues: AditionalValues? = null
    @SerializedName("buyer")
    var buyer: Buyer? = null

    class Buyer : BaseModel() {

        @SerializedName("emailAddress")
        var emailAddress: String? = null
    }
}