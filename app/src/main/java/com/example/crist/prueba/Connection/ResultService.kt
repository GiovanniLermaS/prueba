package com.example.crist.prueba.Connection

import com.example.crist.prueba.Modelo.ResponseRetrofit
import com.example.crist.prueba.UI.Constants

interface ResultService {
    fun onDataReturn(result: ResponseRetrofit?, tag: Constants.RepositoriesTag)
    fun onFailedResponse( result: ResponseRetrofit?, tag: Constants.RepositoriesTag)
}
