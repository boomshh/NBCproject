package com.example.searchapp.API

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

class KaKaoApi {
    companion object {
        const val BASE_URL = "https://dapi.kakao.com/"
    }
}

interface SearchAPI {
    @GET("v2/search/image")
    fun getAPI(
        @Query("query") query: String,
        @Query("size") size: Int) : Call<SearchResult>
}