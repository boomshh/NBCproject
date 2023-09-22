package com.example.searchapp.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.searchapp.API.SearchResult
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val searchRepository: SearchRepository) : ViewModel() {
    val myResponse : MutableLiveData<Response<SearchResult>> = MutableLiveData()

    fun search(query: String, sort: String) {
        viewModelScope.launch {
            val response = searchRepository.getImage(query, sort)
            myResponse.value = response
        }
    }
}