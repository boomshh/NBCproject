package com.example.searchapp.API

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("documents")
    val documents: MutableList<SearchInfo>,

    @SerializedName("meta")
    val metaData: MetaData?
)

data class MetaData(
    @SerializedName("total_count")
    val totalCount: Int,
    @SerializedName("is_end")
    val isEnd: Boolean?
)
data class SearchInfo(
    @SerializedName("thumbnail_url")
    val thumbnailUrl: String,
    @SerializedName("display_sitename")
    val siteName: String,
    @SerializedName("datetime")
    val dataTime: String
)

