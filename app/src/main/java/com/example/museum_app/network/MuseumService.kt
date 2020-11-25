package com.example.museum_app.network

import com.example.museum_app.model.ResponseServer
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MuseumService {

    @GET("api/index.php/CcariMuseum/searchGET?nama=museum")
    fun getDataMuseum():Call<ResponseServer>

    @GET("api/index.php/CcariMuseum/searchGET?nama=")
    fun getFilterMuseum(@Query("nama") nama:String) : Call<ResponseServer>


}
