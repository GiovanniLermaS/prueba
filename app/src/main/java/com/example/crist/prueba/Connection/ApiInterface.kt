package com.example.crist.prueba.Connection

import com.example.crist.prueba.Modelo.ResponseBanks
import com.example.crist.prueba.Modelo.ResponseRetrofit
import retrofit2.http.*
import rx.Observable

interface ApiInterface {

    @PUT
    fun requestServicePut(@Url url: String, @Body request: kotlin.Any): Observable<ResponseBanks?>

    @POST
    fun requestServicePost(@Url url: String, @Body request: kotlin.Any): Observable<ResponseBanks?>

    @GET
    fun requestServiceGet(@Url url: String): Observable<ResponseBanks?>
}
