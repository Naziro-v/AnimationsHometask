package com.nazirov.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val imageView = findViewById<ImageView>(R.id.imageView)

        val bounce = findViewById<Button>(R.id.btn_bounce)
        val sequential = findViewById<Button>(R.id.btn_sequential)
        val togather = findViewById<Button>(R.id.btn_togather)


        bounce.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.bounce)
            imageView.startAnimation(animation)

        }
        sequential.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.sequential)
            imageView.startAnimation(animation)

        }
        togather.setOnClickListener {
            var animation = AnimationUtils.loadAnimation(applicationContext,R.anim.togather)
            imageView.startAnimation(animation)

        }
    }
}