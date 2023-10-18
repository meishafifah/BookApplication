package com.example.meishaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meishaapp.databinding.ActivityHomeBinding
import java.util.ArrayList

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

        val btnSpace:Button = findViewById(R.id.buttonMenu3)

        btnSpace.setOnClickListener {
            val intent = Intent(this,ResponsiActivity::class.java)
            startActivity(intent)
        }

    }
}