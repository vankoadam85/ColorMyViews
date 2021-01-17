package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(binding.root)
            boxOneText.setOnClickListener { makeColored(it) }
            boxTwoText.setOnClickListener { makeColored(it) }
            boxThreeText.setOnClickListener { makeColored(it) }
            boxFourText.setOnClickListener { makeColored(it) }
            boxFiveText.setOnClickListener { makeColored(it) }
            constraintLayout.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View?) {
        when (view) {
            // Boxes using Color class colors for background
            binding.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            binding.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            binding.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view?.setBackgroundColor(Color.LTGRAY)
        }
    }
}