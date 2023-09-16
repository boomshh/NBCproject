package com.example.tel

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tel.MyAdapter.Companion.VIEW_TYPE_NORMAL
import com.example.tel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataList = mutableListOf<MyList>()
        dataList.add(MyList(R.drawable.image, "친구1", "010-0000-0000",true))
        dataList.add(MyList(R.drawable.ex2, "친구2", "010-0000-0001",false))
        dataList.add(MyList(R.drawable.image, "친구3", "010-0000-0002",true))
        dataList.add(MyList(R.drawable.ex2, "친구4", "010-0000-0003", true))
        dataList.add(MyList(R.drawable.image, "친구5", "010-0000-0004", false))
        dataList.add(MyList(R.drawable.ex2, "친구6", "010-0000-0005",false))
        dataList.add(MyList(R.drawable.image,"친구7", "010-0000-0006",false))
        dataList.add(MyList(R.drawable.ex2, "친구8", "010-0000-0007",true))
        dataList.add(MyList(R.drawable.image, "친구9", "010-0000-0008",true))

        binding.recycler.adapter = MyAdapter(dataList)

        val adapter = MyAdapter(dataList)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)

        val dividerItemDecoration = DividerItemDecoration(binding.recycler.context, LinearLayoutManager(this).orientation)
        binding.recycler.addItemDecoration(dividerItemDecoration)

        val spaceDecoration = VerticalSpaceItemDecoration(30)
        binding.recycler.addItemDecoration(spaceDecoration)

    }

    inner class VerticalSpaceItemDecoration(private val verticalSpaceHeight: Int) :
        RecyclerView.ItemDecoration() {

        override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
        ) {
            outRect.bottom = verticalSpaceHeight
            outRect.top = verticalSpaceHeight
        }
    }
}