package com.example.burgerfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BurgerB: TextView = findViewById(R.id.burgerbtm)

        BurgerB.setOnClickListener {
            val intent = Intent(this, BurgerFactory2::class.java)
            startActivity(intent)
        }

        val FreeB: TextView = findViewById(R.id.freebtm)

        FreeB.setOnClickListener {
            val intent = Intent(this, BurgerFactory3::class.java)
            startActivity(intent)
        }

    }
}