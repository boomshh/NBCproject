package com.example.searchapp

data class SearchItem(
    var title: String,
    var dataTime: String,
    var url: String,
    var isLike: Boolean = false
) {
}