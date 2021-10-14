package com.example.kotlinfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            Toast.makeText(this, "Redirecting to SECOND Activity", Toast.LENGTH_SHORT).show()
            val i = Intent(this, SecondActivity::class.java)
            startActivity(i)
        }

        email.setOnClickListener {
            val email = et.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            startActivity(i)
        }
        browser.setOnClickListener {
            val address = et.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            startActivity(i)
        }
        call.setOnClickListener {
            val dial = et.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$dial")
            startActivity(i)
        }
    }
}