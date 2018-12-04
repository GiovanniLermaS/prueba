package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel

class RequestBanks : BaseModel() {

    var language: String? = null
    var command: String? = null
    var merchant: Merchant? = null
    var test: Boolean? = null
    var bankListInformation: BankList? = null
}