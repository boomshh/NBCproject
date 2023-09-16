package com.example.searchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.searchapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val tabTextList = listOf("검색결과", "내 보관함")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewPager2.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(binding.tapLayout, binding.viewPager2) { tab, pos ->
            tab.text = tabTextList[pos]
        }.attach()

    }
}