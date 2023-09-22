package com.example.searchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import com.example.searchapp.Like.LikeFragment
import com.example.searchapp.Like.LikedAdapter
import com.example.searchapp.ViewPagerAdapter.ViewPagerAdapter
import com.example.searchapp.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val viewPagerAdapter by lazy {ViewPagerAdapter(this)}
    private lateinit var likedAdapter: LikedAdapter


    private val tabTextList = listOf("검색", "찜")

    var likedItem : ArrayList<SearchItems> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.viewPager2.adapter = viewPagerAdapter
        binding.viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, pos ->
            tab.text = tabTextList[pos]
        }.attach()

        likedAdapter = LikedAdapter(this)

    }

    fun addLikedItem(item: SearchItems) {
        if(!likedItem.contains(item)) {
            likedItem.add(item)
            likedAdapter.update(likedItem)
            updateItems()

            Log.d("test","$item" )
        }
    }

    fun removeItem(item: SearchItems) {
        likedItem.remove(item)
        likedAdapter.update(likedItem)
        updateItems()
        Log.d("test","$item" )

    }

    private fun updateItems () {
        val likeFragment = viewPagerAdapter.getFragment(1) as LikeFragment
        likeFragment.updateItems(likedItem)
    }
}