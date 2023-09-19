package com.example.searchapp.MyAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.searchapp.Fragment.LikeFragment
import com.example.searchapp.Fragment.SearchFragment

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){

    private var fragments: ArrayList<Fragment> = arrayListOf(SearchFragment(), LikeFragment())

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    fun getFragment(position: Int): Fragment {
        return fragments[position]
    }
}