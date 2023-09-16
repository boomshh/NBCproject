package com.example.lifecycle

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.example.lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Log.d("Main", "onCreate")

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val fragmentManager: FragmentManager = supportFragmentManager

        // 프래그먼트 생성
        binding.button2.setOnClickListener {
            val fragment: Fragment = TestFragment()
            fragmentManager.commit {
                add(R.id.fragment, fragment, "add")
                Log.d("Main", "add")
            }

        }

        // 프래그먼트 삭제
        binding.button3.setOnClickListener {
//            val fragment: Fragment = TestFragment()
            fragmentManager.commit {
//                remove(fragment)
                    fragmentManager.findFragmentByTag("add")?.let { remove(it) }
                Log.d("Main", "remove")

            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Main", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "onDestroy")

    }
}

fun Context.showText(message: String, time: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, time).show()
}