package com.example.act7


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvName = findViewById<TextView>(R.id.tvName)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val name = intent.getStringExtra("name")
        tvName.text = "Mi nombre es: $name"

        btnBack.setOnClickListener {
            finish()
        }
    }
}