package com.example.crist.prueba.UI

class Constants {

    interface Connection {
        companion object {
            val API_BASEURL = "https://sandbox.api.payulatam.com"
        }
    }

    enum class RepositoriesTag(val url: String) {
        BANKS("banks")
    }

    enum class HttpTypeMethod {
        post, get, put, delete
    }
}