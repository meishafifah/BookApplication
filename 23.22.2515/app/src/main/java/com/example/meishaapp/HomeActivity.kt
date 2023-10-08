package com.example.meishaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore:Button = findViewById(R.id.buttonMore)

        btnMore.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)
        }

        val btnBook:Button = findViewById(R.id.buttonMenu1)

        btnBook.setOnClickListener {
            val intent = Intent(this,BookKidActivity::class.java)
            startActivity(intent)
        }
    }
}