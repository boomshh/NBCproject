package com.example.searchapp.Search

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.searchapp.R
import com.example.searchapp.ViewModel.SearchRepository
import com.example.searchapp.ViewModel.MainViewModel
import com.example.searchapp.ViewModel.ViewModelFactory
import com.example.searchapp.databinding.FragmentSearchBinding

class SearchFragment : Fragment(R.layout.fragment_search) {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: SearchAdapter
    private lateinit var mContext: Context
    private lateinit var viewModel: MainViewModel
    private lateinit var gridManager : StaggeredGridLayoutManager



    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(layoutInflater)

        val searchRepository = SearchRepository()
        val viewModelFactory = ViewModelFactory(searchRepository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        setUpView()

        return binding.root
    }


    private fun setUpView() {

        gridManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerView.layoutManager = gridManager

        val gridItemDecoration = GridItemDecoration(spanCount = 2, spacing = 16f.fromDpToPx())
        binding.recyclerView.addItemDecoration(gridItemDecoration)

        adapter = SearchAdapter(mContext)
        binding.recyclerView.adapter = adapter

        binding.recyclerView.itemAnimator = null

        binding.searchBtn.setOnClickListener {
            performSearch()
        }
    }

    private fun performSearch() {
        val query = binding.editText.text.toString()
        val sort = "recency"

        viewModel = MainViewModel(SearchRepository())
        viewModel = ViewModelProvider(this, ViewModelFactory(SearchRepository())).get(MainViewModel::class.java)
        viewModel.search(query,sort)

        viewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
            if( response.isSuccessful) {
                val myResponse = response.body()?.documents
                if (myResponse != null) {
                    adapter.setItems(myResponse)
                }
            }
        })
    }

    fun Float.fromDpToPx() : Int =
        (this * Resources.getSystem().displayMetrics.density).toInt()


}

