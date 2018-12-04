package com.example.crist.prueba.Connection

import com.example.crist.prueba.Modelo.ResponseRetrofit
import retrofit2.http.*
import rx.Observable

interface ApiInterface {

    @PUT
    fun requestServicePut(@Body request: kotlin.Any): Observable<ResponseRetrofit?>

    @POST
    fun requestServicePost(@Body request: kotlin.Any): Observable<ResponseRetrofit?>

    @GET
    fun requestServiceGet(): Observable<ResponseRetrofit?>
}
