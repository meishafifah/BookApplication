package com.example.meishaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // instance
        val buttonLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername: EditText = findViewById(R.id.username)
        val txtPassword: EditText = findViewById(R.id.password)
        val logModel = LoginModel()
        buttonLogin.setOnClickListener {
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            if (logModel.loginCek() == true) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Username/Password salah bro, ketik yang benerlah minimal", Toast.LENGTH_SHORT).show()
            }
        }
    }
}