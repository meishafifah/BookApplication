package com.example.meishaapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ResponsiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_responsi)

        val call: ImageView = findViewById(R.id.telpResp)
        call.setOnClickListener {
            val callIntent: Intent = Uri.parse("tel:0274884201").let {
                    number-> Intent(Intent.ACTION_DIAL,number)
            }
            startActivity(callIntent)
        }

        val rvResp: RecyclerView = findViewById(R.id.recyclerResp) // Menggunakan findViewById untuk mendapatkan referensi ke RecyclerView
        rvResp.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<RespModel>()
        data.add(RespModel(R.drawable.book1, "Emi's Beach Adventure", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))
        data.add(RespModel(R.drawable.book2, "Ade's Beach Adventure", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))
        data.add(RespModel(R.drawable.book4, "Mermaid to rescue", "Lorem Ipsum Lorem Ipsum Lorem Ipsum Lorem Ipsum"))

        val adapter = AdapterResp(data)
        rvResp.adapter = adapter
    }
}