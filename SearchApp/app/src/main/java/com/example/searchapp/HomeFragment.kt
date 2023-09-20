package com.example.searchapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.searchapp.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private val tabTextList = listOf("검색", "찜")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewPager2.adapter = activity?.let { ViewPagerAdapter(it) }
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, pos ->
            tab.text = tabTextList[pos]
        }.attach()

        return binding.root

    }
}