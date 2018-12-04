package com.example.crist.prueba.Presentation

import android.util.Log
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import org.json.JSONArray
import org.json.JSONException
import java.io.Serializable
import java.util.ArrayList

open class BaseModel : Serializable {

    fun toJsonString(): String {
        return Gson().toJson(this)
    }

    fun isModelArray(json: String): Boolean {
        try {
            JSONArray(json)
        } catch (jsonException: JSONException) {
            return false

        }

        return true
    }

    fun objectFromJson(json: String, type: Class<out BaseModel>): BaseModel? {
        var model: BaseModel? = null
        try {
            model = Gson().fromJson(json, type)
        } catch (e: JsonSyntaxException) {
            Log.e("Gson error in", type.toString())
            e.printStackTrace()
        }

        return model
    }

    fun arrayFromJson(json: String, type: Class<out BaseModel>): ArrayList<out BaseModel?> {
        val jsonArray = JSONArray(json)
        return (0 until jsonArray.length())
            .map { jsonArray.get(it).toString() }
            .mapTo(ArrayList()) { BaseModel().objectFromJson(it, type) }
    }
}
