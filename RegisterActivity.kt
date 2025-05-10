package com.example.fitnesschatapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nameInput: EditText = findViewById(R.id.nameInput)
        val emailInput: EditText = findViewById(R.id.emailInput)
        val passwordInput: EditText = findViewById(R.id.passwordInput)
        val registerButton: Button = findViewById(R.id.registerButton)

        registerButton.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            // Validasi sederhana
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Isi semua field!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            // Log event
            Log.d("REGISTER", "Nama: $name, Email: $email, Password: $password")

            // Tampilkan Toast
            Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()

            // Pindah ke List Chat Activity
            val intent = Intent(this, ListChatActivity::class.java)
            startActivity(intent)
        }
    }
}
