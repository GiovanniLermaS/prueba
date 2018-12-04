package com.example.crist.prueba.UI

import com.example.crist.prueba.Connection.ApiInterface
import com.example.crist.prueba.Connection.ClientNet

fun getAPIService(): ApiInterface {
    return ClientNet.getClient().create(ApiInterface::class.java)
}
