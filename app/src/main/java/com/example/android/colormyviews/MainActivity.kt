package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var clickableViews: List<View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        with(binding) {
            setContentView(binding.root)
            clickableViews = listOf(boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
                constraintLayout, greenButton, redButton, yellowButton)
        }
        for (view in clickableViews) {
            view.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View?) {
        with(binding){
            when (view) {
                // Boxes using Color class colors for background
                boxOneText -> view.setBackgroundColor(Color.DKGRAY)
                boxTwoText -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
                boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
                boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

                // Boxes using custom colors for background
                redButton -> boxThreeText.setBackgroundResource(R.color.my_red)
                yellowButton -> boxFourText.setBackgroundResource(R.color.my_yellow)
                greenButton -> boxFiveText.setBackgroundResource(R.color.my_green)

                else -> view?.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}