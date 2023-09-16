package com.example.tel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tel.databinding.Item22Binding
import com.example.tel.databinding.ItemBinding



class MyAdapter (val mItems:MutableList<MyList>) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val VIEW_TYPE_NORMAL = 0
        const val VIEW_TYPE_FAVORITE = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            VIEW_TYPE_NORMAL -> {
                var binding =
                    ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return oneHolder(binding)
            }

            VIEW_TYPE_FAVORITE -> {
                var binding =
                    Item22Binding.inflate(LayoutInflater.from(parent.context), parent, false)
                return twoHolder(binding)
            }

            else -> throw IllegalArgumentException("공백")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is oneHolder) {
            holder.bind(mItems[position])
        } else if (holder is twoHolder) {
            holder.bind(mItems[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        val like = mItems[position]
        return if (like.aLike) {
            VIEW_TYPE_FAVORITE
        }  else {
            VIEW_TYPE_NORMAL
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }


    inner class oneHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyList) {
            binding.imageView.setImageResource(item.aImage)
            binding.textView.text = item.aName
            binding.textView2.text = item.aNumber
        }

    }

    inner class twoHolder(private val binding: Item22Binding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: MyList) {
            binding.imageView1.setImageResource(item.aImage)
            binding.textView3.text = item.aName
            binding.textView4.text = item.aNumber
        }
    }
}




