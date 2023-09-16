package com.example.market

import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.market.databinding.ItemBinding
import java.util.logging.Handler

class MyAdapter(val mItems:MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {

    interface ItemClick {
        fun onClick(view: View, position: Int)
    }
    interface ItemLongClick {
        fun onLongClick(view: View, position: Int)
    }
    var itemClick : ItemClick? = null
    var itemLongClick: ItemLongClick? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.Holder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: MyAdapter.Holder, position: Int) {
        holder.iconImageView.setImageResource(mItems[position].aIcon)
        holder.name.text = mItems[position].aName
        holder.address.text = mItems[position].aAddress
        holder.price.text = mItems[position].aPrice
        holder.comment.text = mItems[position].aComment
        holder.like.text = mItems[position].aLike

        holder.itemView.setOnClickListener {
            itemClick?.onClick(it, position)
        }

        // 2초간 클릭했을 때 삭제
        val longClick = android.os.Handler()
        holder.itemView.setOnLongClickListener {
            longClick.postDelayed({
                itemLongClick?.onLongClick(it, position)
            }, 2000)
            true
        }

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class Holder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {


        val iconImageView = binding.imageView
        val name = binding.textView
        val address = binding.textView2
        val price = binding.textView3
        val comment = binding.textView4
        val like = binding.textView5

        init {
            binding.imageView.clipToOutline = true
        }
    }

}