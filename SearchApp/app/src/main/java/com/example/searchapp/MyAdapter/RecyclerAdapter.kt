package com.example.searchapp.MyAdapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.searchapp.API.SearchData
import com.example.searchapp.databinding.ItemBinding

    class RecyclerAdapter(private var list: List<SearchData>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val searchData = list[position]
            holder.bind(searchData)
        }

        override fun getItemCount(): Int {
            return list.size
        }


        inner class ViewHolder(val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root) {
            fun bind(searchData: SearchData) {
                Glide.with(binding.searchImage)
                    .load(searchData.thumbnailUrl)
                    .centerCrop()
                    .into(binding.searchImage)

            }
        }

        fun updateData(newItemList: List<SearchData>) {
            this.list = newItemList
            notifyDataSetChanged() // 데이터 변경을 RecyclerView에 알림.
        }

    }