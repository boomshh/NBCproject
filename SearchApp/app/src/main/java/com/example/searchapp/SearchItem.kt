package com.example.searchapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SearchItem(
    var title: String,
    var thumbnail: String,
    var dataTime: String,
    var isLike: Boolean = false,
) : Parcelable {
}