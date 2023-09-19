package com.example.searchapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.searchapp.API.SearchBody
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SearchViewModel(private val searchRepository: SearchRepository): ViewModel() {



//    private val repository = SearchRepository.getInstance()
//
//    private val _searchResult = MutableLiveData<SearchBody>()
//
//    fun performSearch() {
//        GlobalScope.launch(Dispatchers.IO) {
//            val result = repository?.retrofitSelect()
//            _searchResult.postValue(result)
//        }
//    }

}