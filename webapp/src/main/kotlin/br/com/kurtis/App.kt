package br.com.kurtis

import br.com.kurtis.http.resultJson
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path

fun main() {
    Javalin
            .create { it.enableCorsForAllOrigins() }
            .routes {
                path("users") {
                    get("/") { it.resultJson(Response("Hello World")) }
                }
            }
            .start(8080)
}

data class Response(val message: String)