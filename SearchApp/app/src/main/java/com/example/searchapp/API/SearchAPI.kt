package com.example.searchapp.API

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface SearchAPI {
    @GET("v2/search/image")
    suspend fun getImage(
        @Header("Authorization") Authorization: String = Constants.AUTH_HEADER,
        @Query("query") query: String,
        @Query("size") size: Int,
        @Query("sort") sort : String,
        @Query("page") page : Int
    ) : Response<SearchResult>
}