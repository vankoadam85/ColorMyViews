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
        if (view != null) {
            when (view.id) {
                // Boxes using Color class colors for background
                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}