package com.example.fitnesschatapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val emailInput: EditText = findViewById(R.id.loginEmailInput)
        val passwordInput: EditText = findViewById(R.id.loginPasswordInput)
        val loginButton: Button = findViewById(R.id.loginButton)
        val toRegisterButton: Button = findViewById(R.id.toRegisterButton)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email dan Password wajib diisi!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Log.d("LOGIN", "Email: $email")
            Toast.makeText(this, "Login Berhasil!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, ListChatActivity::class.java))
        }

        toRegisterButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
