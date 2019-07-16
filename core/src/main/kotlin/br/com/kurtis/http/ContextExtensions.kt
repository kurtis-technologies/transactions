package br.com.kurtis.http

import com.google.gson.Gson
import io.javalin.http.Context

fun Context.resultJson(result: Any) = this.contentType("application/json").result(Gson().toJson(result))