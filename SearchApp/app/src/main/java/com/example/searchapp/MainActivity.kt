package com.example.searchapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.searchapp.ViewPagerAdapter.HomeFragment
import com.example.searchapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    private val fragmentManager = supportFragmentManager
    private lateinit var transaction: FragmentTransaction

    var likedItem : ArrayList<SearchItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        transaction = fragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, HomeFragment())
        transaction.commit()

    }

    fun addLikedItem(item: SearchItem) {
        if(!likedItem.contains(item)) {
            likedItem.add(item)
        }
    }

    fun removeItem(item: SearchItem) {
        likedItem.remove(item)
    }


}