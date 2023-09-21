package com.example.searchapp.Like

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.searchapp.SearchItem
import com.example.searchapp.databinding.ItemBinding

class LikedAdapter(private val context: Context) : RecyclerView.Adapter<LikedAdapter.ViewHolder>() {

    var likedItems = mutableListOf<SearchItem>()



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return likedItems.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = likedItems[position]
        Glide.with(context)
            .load(item.thumbnail)
            .into(holder.thumbnail)
        holder.title.text = item.title
        holder.data.text = item.dataTime
    }

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        var isLike: ImageView = binding.isLike
        var thumbnail: ImageView = binding.thumbnailImageView
        var title: TextView = binding.title
        var data: TextView = binding.date

        init {
            isLike.visibility = View.GONE

            // 아이템 클릭 리스너 설정
            thumbnail.setOnClickListener {
                val position = absoluteAdapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    likedItems.removeAt(position)
                    notifyItemRemoved(position)
                }
            }
        }

    }


}
