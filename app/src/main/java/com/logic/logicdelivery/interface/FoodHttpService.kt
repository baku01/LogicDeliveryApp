package com.logic.logicdelivery.`interface`

import com.logic.logicdelivery.model.Productsection
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


@Service
interface FoodHttpService {


    @GET("food")
    fun getAll(@Query("food") food: String): Call<List<Productsection>>


}