package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel

class ResponseBanks : BaseModel() {

    var code: String? = null
    var error: String? = null
    var banks = ArrayList<Banks>()
}