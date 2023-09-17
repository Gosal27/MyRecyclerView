package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Detail : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val receivedHero = intent.getParcelableExtra<Hero>(EXTRA_HERO)

        if (receivedHero != null) {
            val heroImageView = findViewById<ImageView>(R.id.heroImageView)
            val heroNameTextView = findViewById<TextView>(R.id.heroNameTextView)
            val heroDescriptionTextView = findViewById<TextView>(R.id.heroDescriptionTextView)
            val heroDetailTextView = findViewById<TextView>(R.id.heroDetailTextView)

            heroImageView.setImageResource(receivedHero.photo)
            heroNameTextView.text = receivedHero.name
            heroDescriptionTextView.text = receivedHero.description
            heroDetailTextView.text = receivedHero.detail

            val btnBack = findViewById<ImageButton>(R.id.back)
            btnBack.setOnClickListener {
                onBackPressed()
            }
        }
    }
}