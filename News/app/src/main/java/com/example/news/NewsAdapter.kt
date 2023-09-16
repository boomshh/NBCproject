package com.example.news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.news.databinding.FragmentNewsTitleBinding
import com.example.news.databinding.ItemBinding

class NewsAdapter(private val newsList:MutableList<NewsItem>,private val itemClick: (NewsItem) -> Unit) : RecyclerView.Adapter<NewsAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : Holder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val newsItem = newsList[position]
        holder.bind(newsItem)

        holder.itemView.setOnClickListener {
            itemClick(newsItem)
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    inner class Holder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(newsItem: NewsItem) {
            binding.titleText.text = newsItem.title
            binding.smallText.text = newsItem.article
            binding.root.setOnClickListener {
            }
        }
    }
}