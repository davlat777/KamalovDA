package com.example.burgerfactory

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BurgerFactory2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_factory2)

        val home: ImageView = findViewById(R.id.home)

        home.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val gloves: ImageView = findViewById(R.id.gloves)

        gloves.setOnClickListener {
            val intent = Intent(this, Gloves::class.java)
            startActivity(intent)
        }
    }
}