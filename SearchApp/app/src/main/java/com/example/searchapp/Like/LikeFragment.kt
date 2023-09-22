package com.example.searchapp.Like

import android.content.Context
import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.searchapp.MainActivity
import com.example.searchapp.R
import com.example.searchapp.Search.GridItemDecoration
import com.example.searchapp.SearchItem
import com.example.searchapp.databinding.FragmentLikeBinding


class LikeFragment : Fragment(R.layout.fragment_like) {

    private lateinit var binding: FragmentLikeBinding
    private lateinit var adapter: LikedAdapter
    private lateinit var gridManager : StaggeredGridLayoutManager
    private lateinit var mContext: Context

    private var likedItem: List<SearchItem> = listOf()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikeBinding.inflate(layoutInflater)

        val mainActivity = activity as MainActivity
        likedItem = mainActivity.likedItem

        adapter = LikedAdapter(mContext).apply {
            likedItems = likedItem.toMutableList()
            Log.d("test4", "$likedItems")
        }

        setUpView()

        return binding.root

    }

    private fun setUpView() {

        gridManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        binding.likeRecycler.layoutManager = gridManager

        val gridItemDecoration = GridItemDecoration(spanCount = 2, spacing = 16f.fromDpToYx())
        binding.likeRecycler.addItemDecoration(gridItemDecoration)

        binding.likeRecycler.adapter = adapter

        binding.likeRecycler.itemAnimator = null

    }

    fun updateItems(newItems : List<SearchItem>) {
        if(::adapter.isInitialized) {
            adapter.update(newItems)
        }
    }

    fun Float.fromDpToYx() : Int =
        (this * Resources.getSystem().displayMetrics.density).toInt()
}
