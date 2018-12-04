package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class Banks : BaseModel() {

    @SerializedName("id")
    var id: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("pseCode")
    var pseCode: String? = null
}