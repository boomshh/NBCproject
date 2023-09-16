package com.example.signin

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class HomeActivity : AppCompatActivity() {

    private val imageArray = arrayOf (
        R.drawable.profile,
        R.drawable.profile1,
        R.drawable.profile2,
        R.drawable.profile3,
        R.drawable.profile4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val finishBtn = findViewById<Button>(R.id.finishBtn)
        val idText = findViewById<TextView>(R.id.getId)

        val getId = intent.getStringExtra("ID")

        val imageView = findViewById<ImageView>(R.id.profileview)
        setRandomImage(imageView)

        idText.text = getId

        finishBtn.setOnClickListener {
            finish()
        }
    }
    private fun setRandomImage(imageView : ImageView) {
        val randomIndex = (imageArray.indices).random()
        //indices : 최소 인덱스부터 최대인덱스까지 랜덤으로 불러옴.
        val randomImageResourceId = imageArray[randomIndex]
        imageView.setImageResource(randomImageResourceId)
        // setImageResource : ImageView의 이미지를 변경하기 위해 사용.
    }
}