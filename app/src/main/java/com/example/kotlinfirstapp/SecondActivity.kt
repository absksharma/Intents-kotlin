package com.example.kotlinfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btn2.setOnClickListener {
            Toast.makeText(this, "Redirecting to First Activity", Toast.LENGTH_SHORT).show()
            val inn = Intent(this, MainActivity::class.java)
            startActivity(inn)
            finish()
        }
    }
}