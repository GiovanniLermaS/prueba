package com.example.crist.prueba.Connection

import android.content.Context
import com.example.crist.prueba.Modelo.ResponseBanks
import com.example.crist.prueba.Modelo.ResponseRetrofit
import com.example.crist.prueba.R
import com.example.crist.prueba.UI.Constants
import com.example.crist.prueba.UI.getAPIService
import kotlinx.coroutines.experimental.launch
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers


class ClientNet {
    companion object {
        private lateinit var retrofit: Retrofit
        fun getClient(): Retrofit {
            retrofit = Retrofit.Builder()
                .baseUrl(Constants.Connection.API_BASEURL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build()
            return retrofit
        }
    }
}

fun Context.requestService(
    request: kotlin.Any?,
    tag: Constants.RepositoriesTag,
    method: Constants.HttpTypeMethod,
    url: String
) {
    launch {
        val listener: ResultService? = this@requestService as ResultService
        val callback: Subscriber<ResponseBanks> = object : Subscriber<ResponseBanks>() {
            override fun onNext(t: ResponseBanks?) {
                listener?.onDataReturn(t, tag)
            }

            override fun onCompleted() {
            }

            override fun onError(e: Throwable?) {
                //val retrofit = ResponseBanks(0, e!!.message!!, this@requestService.getString(R.string.no_data))
                //listener?.onDataReturn(, tag)
                print("Any message  ")
            }
        }
        when (method) {
            Constants.HttpTypeMethod.put -> getAPIService().requestServicePut(url, request!!).subscribeOn(
                Schedulers.io()
            ).observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback)
            Constants.HttpTypeMethod.post -> getAPIService().requestServicePost(
                url,
                request!!
            ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback)
            Constants.HttpTypeMethod.get -> getAPIService().requestServiceGet(
                url
            ).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback)

            else -> return@launch
        }
    }
}