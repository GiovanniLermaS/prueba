package com.example.crist.prueba.Connection

import com.example.crist.prueba.Modelo.ResponseRetrofit
import retrofit2.http.*
import rx.Observable

interface ApiInterface {

    @PUT
    fun requestServicePut(@Url url: String, @Body request: kotlin.Any): Observable<ResponseRetrofit?>

    @POST
    fun requestServicePost(@Url url: String, @Body request: kotlin.Any): Observable<ResponseRetrofit?>

    @GET
    fun requestServiceGet(@Url url: String): Observable<ResponseRetrofit?>
}
