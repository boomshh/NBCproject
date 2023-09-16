package com.example.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.news.databinding.FragmentNewsDetailBinding


class NewsDetail : Fragment() {

    private lateinit var binding: FragmentNewsDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsDetailBinding.inflate(inflater, container, false)

        val textView1: TextView = binding.textView1
        val textView2: TextView = binding.textView2

        arguments?.let {
            val titleDetail = it.getString("title")
            val articleDetail = it.getString("article")
            textView1.text = titleDetail
            textView2.text = articleDetail

        }
        return binding.root
    }
}