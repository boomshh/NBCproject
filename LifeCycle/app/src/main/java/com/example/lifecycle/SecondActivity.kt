package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.lifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("SecondOnCreate", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondOnStart", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondOnResume", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondOnPause", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondOnStop", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondOnDestroy", "onDestroy")

    }
}