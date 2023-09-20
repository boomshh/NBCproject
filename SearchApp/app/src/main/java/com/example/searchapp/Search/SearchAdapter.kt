package com.example.searchapp.Search

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.searchapp.API.SearchInfo
import com.example.searchapp.API.SearchResult
import com.example.searchapp.SearchItem
import com.example.searchapp.databinding.ItemBinding

class SearchAdapter(private val context: Context) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    private var items = ArrayList<SearchInfo>()

    fun setItems(newItems: List<SearchInfo>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }



    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)

    }

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SearchInfo) {
            Glide.with(context)
                .load(item.thumbnailUrl)
                .into(binding.thumbnailImageView)

            binding.title.text = item.siteName
            binding.date.text = item.dataTime
        }
    }


}