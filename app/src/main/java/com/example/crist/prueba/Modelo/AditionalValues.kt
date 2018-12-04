package com.example.crist.prueba.Modelo

import com.example.crist.prueba.Presentation.BaseModel
import com.google.gson.annotations.SerializedName

class AditionalValues : BaseModel() {

    @SerializedName("TX_VALUE")
    var TX_VALUE: TxValue? = null
    @SerializedName("TX_TAX")
    var TX_TAX: TxValue? = null
    @SerializedName("TX_TAX_RETURN_BASE")
    var TX_TAX_RETURN_BASE: TxValue? = null

    class TxValue : BaseModel() {

        @SerializedName("value")
        var value: String? = null
        @SerializedName("currency")
        var currency: String? = null
    }
}