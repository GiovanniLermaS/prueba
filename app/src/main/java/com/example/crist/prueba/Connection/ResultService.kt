package com.example.crist.prueba.Connection

import com.example.crist.prueba.Modelo.ResponseBanks
import com.example.crist.prueba.Modelo.ResponseRetrofit
import com.example.crist.prueba.UI.Constants

interface ResultService {
    fun onDataReturn(result: ResponseBanks?, tag: Constants.RepositoriesTag)
}
