package com.example.searchapp.Search

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.searchapp.API.SearchInfo
import com.example.searchapp.MainActivity
import com.example.searchapp.SearchItem
import com.example.searchapp.ViewPagerAdapter.HomeFragment
import com.example.searchapp.databinding.ItemBinding

class SearchAdapter(private val context: Context) :
    RecyclerView.Adapter<SearchAdapter.ViewHolder>() {

    private var items = ArrayList<SearchItem>()

    fun setItems(newItem: List<SearchInfo>) {
        items.clear()
        items.addAll(newItem.map { searchInfo ->
            SearchItem(
                thumbnail = searchInfo.thumbnailUrl,
                title = searchInfo.siteName,
                dataTime = searchInfo.dataTime
            )
        })
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }



    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)  {
        val item = items[position]
        Glide.with(context)
            .load(item.thumbnail)
            .into(holder.thumbnail)

        holder.isLike.visibility = if(item.isLike) View.VISIBLE else View.INVISIBLE
        holder.title.text = item.title
        holder.data.text = item.dataTime

    }

    inner class ViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        var thumbnail: ImageView = binding.thumbnailImageView
        var isLike: ImageView = binding.isLike
        var title: TextView = binding.title
        var data: TextView = binding.date

        init {
            isLike.visibility = View.GONE
            thumbnail.setOnClickListener(this)

        }

        override fun onClick(view: View?) {
            val position = absoluteAdapterPosition
            if (position != RecyclerView.NO_POSITION) {
                val item = items[position]
                item.isLike = !item.isLike

                if (item.isLike) {
                    (context as MainActivity).addLikedItem(item)
                    Log.d("btn", "저장")
                } else {
                    (context as MainActivity).removeItem(item)
                }
                notifyItemChanged(position)
            }
        }
    }


}