package com.example.news

import android.graphics.Rect
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news.databinding.FragmentNewsTitleBinding


class NewsTitle : Fragment() {

    private lateinit var adapter: NewsAdapter
    private lateinit var binding: FragmentNewsTitleBinding
    private val newsData = NewsData()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsTitleBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val newsDummy = newsData.getNewsData()

        adapter = NewsAdapter(newsDummy) { NewsItem ->
            val detailFragment = NewsDetail()
            val bundle = Bundle()
            bundle.putString("title", NewsItem.title)
            bundle.putString("article", NewsItem.article)
            detailFragment.arguments = bundle

            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frame, detailFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        binding.titleRecycler.adapter = adapter
        binding.titleRecycler.layoutManager = LinearLayoutManager(context)

        val dividerItemDecoration = DividerItemDecoration(binding.titleRecycler.context, LinearLayoutManager(context).orientation)
        binding.titleRecycler.addItemDecoration(dividerItemDecoration)

        val spaceDecoration = VerticalSpaceItemDecoration(30)
        binding.titleRecycler.addItemDecoration(spaceDecoration)

    }

    inner class VerticalSpaceItemDecoration(private val verticalSpaceHeight: Int) :
        RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            outRect.bottom = verticalSpaceHeight
            outRect.top = verticalSpaceHeight
        }
    }
}