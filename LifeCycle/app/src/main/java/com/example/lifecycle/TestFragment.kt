package com.example.lifecycle

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class TestFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("fragment", "onCreate")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("fragment", "onCreateView")
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("fragment", "onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("fragment", "onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment", "onStop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("fragment", "onSaveInstanceState")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment", "onDestroy")
    }
}