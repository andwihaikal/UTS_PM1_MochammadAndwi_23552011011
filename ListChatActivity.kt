package com.example.fitnesschatapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_chat)

        val listView: ListView = findViewById(R.id.chatListView)
        val dummyChats = arrayOf("Coach Rina", "GymBro Adit", "FitGirl Nana")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dummyChats)
        listView.adapter = adapter
    }
}
