package com.example.crist.prueba.Presentation.Home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.example.crist.prueba.Connection.ResultService
import com.example.crist.prueba.Connection.requestService
import com.example.crist.prueba.Modelo.RequestBanks
import com.example.crist.prueba.Modelo.ResponseBanks
import com.example.crist.prueba.Modelo.ResponseRetrofit
import com.example.crist.prueba.Presentation.BaseModel
import com.example.crist.prueba.R
import com.example.crist.prueba.UI.Constants
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_home.*
import org.json.JSONException
import org.json.XML
import org.json.JSONObject
import java.util.ArrayList

class HomeActivity : AppCompatActivity(), ResultService {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val requestBank = RequestBanks()
        requestBank.language = "es"
        requestBank.command = "GET_BANKS_LIST"
        requestBank.merchant.apiLogin = "pRRXKOl8ikMmt9u"
        requestBank.merchant.apiKey = "4Vj8eK4rloUd272L48hsrarnUA"
        requestBank.test = false
        requestBank.bankListInformation.paymentMethod = "PSE"
        requestBank.bankListInformation.paymentCountry = "CO"
        requestService(
            requestBank,
            Constants.RepositoriesTag.BANKS,
            Constants.HttpTypeMethod.post,
            "/payments-api/4.0/service.cgi"
        )
    }

    override fun onDataReturn(result: ResponseBanks?, tag: Constants.RepositoriesTag) {
        when (tag) {
            Constants.RepositoriesTag.BANKS -> {
                val jsonObj: JSONObject?
                try {
                    jsonObj = XML.toJSONObject(result.toString())
                    val banks =
                        BaseModel().objectFromJson(Gson().toJson(jsonObj), ResponseBanks::class.java) as ResponseBanks
                    val kBanks = banks.banks
                    val arrayBanks = ArrayList<String>()
                    kBanks.mapTo(arrayBanks) { it.description!! }
                    spBank.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayBanks)

                } catch (e: JSONException) {
                    Log.e("JSON exception", e.message)
                    e.printStackTrace()
                }
            }
        }
    }
}
