package com.example.searchapp.ViewModel

import com.example.searchapp.Retrofit.SearchRetrofit
import com.example.searchapp.API.SearchResult
import retrofit2.Response

class SearchRepository {
    suspend fun getImage(query: String, sort: String): Response<SearchResult> {
        return SearchRetrofit.api.getImage(query = query, sort = sort, page= 1, size= 80)
    }

}