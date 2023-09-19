package com.example.searchapp.API

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("documents")
    val list: List<SearchInfo>
)

data class SearchInfo(
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String,
    @SerializedName("display_sitename")
    val siteName: String,
    @SerializedName("datetime")
    val dataTime: String
)

