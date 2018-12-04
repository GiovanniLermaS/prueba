package com.example.crist.prueba.UI

class Constants {

    interface Connection {
        companion object {
            val API_BASEURL = "http://admin.uinrun.com"
        }
    }

    enum class RepositoriesTag(val url: String) {
        BANKS("banks")
    }

    enum class HttpTypeMethod {
        post, get, put, delete
    }
}