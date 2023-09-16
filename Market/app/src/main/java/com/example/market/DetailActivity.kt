package com.example.market

import android.app.Activity
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.annotation.RequiresApi
import com.example.market.databinding.ActivityDetailBinding
import com.example.market.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class DetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityDetailBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val getItem = intent.getParcelableExtra<MyItem>("myItem")
        if(getItem != null) {
            binding.detailImageView.setImageResource(getItem.aIcon)
            binding.textView6.text = getItem.aPerson
            binding.textView7.text = getItem.aAddress
            binding.textView8.text = getItem.aName
            binding.textView9.text = getItem.aEx
            binding.textView10.text = getItem.aTem
            binding.imageView4.setImageResource(getItem.aEmo)
            binding.textView13.text = getItem.aPrice
        }

        // 하트 좋아요
        val isLiked = false
        val heartIcon = binding.imageBtn

        heartIcon.setOnClickListener {
            if (isLiked) {
                heartIcon.setImageResource(R.drawable.heart)
            }

            // 하트 클릭
            else {
                heartIcon.setImageResource(R.drawable.heart1)
                Snackbar.make(binding.root, "관심 목록에 추가 되었습니다.", Snackbar.LENGTH_SHORT).show()
            }
        }

        binding.backBtn.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("isLiked", isLiked) // 추가: 좋아요 상태 데이터 전달
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        binding.chatBtn.setOnClickListener {
            Snackbar.make(binding.root, "공사중입니다.", Snackbar.LENGTH_SHORT).show()
        }
        // 뒤로가기 버튼
        binding.backBtn.setOnClickListener {
            finish()
        }
    }
}








