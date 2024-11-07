package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val poemTitle = findViewById<TextView>(R.id.poemTitle)
        val poemText = findViewById<TextView>(R.id.poemText)

        poemTitle.setTextColor(ContextCompat.getColor(this, R.color.holo_red_dark))

        poemText.textSize = 20f // Размер текста в sp

        poemTitle.setTypeface(poemTitle.typeface, android.graphics.Typeface.BOLD)

        poemTitle.textSize = 30f // Увеличиваем размер заголовка
    }
}