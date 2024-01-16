package com.logic.logicdelivery.config

import com.logic.logicdelivery.`interface`.FoodHttpService
import okhttp3.OkHttpClient
import org.springframework.context.annotation.Bean
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class HttpConfiguration {

    private companion object {
        const val BASE_URL = "https://run.mocky.io/v3/"
    }

    private fun buildClient() = OkHttpClient.Builder().build()

    private fun buildRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(buildClient())
        .build()

    @Bean
    fun foodHttpService(): FoodHttpService = buildRetrofit().create(FoodHttpService::class.java)












}