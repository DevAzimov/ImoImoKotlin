package com.magicapp.imokotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.magicapp.imokotlin.R
import com.magicapp.imokotlin.adapter.ChatAdapter
import com.magicapp.imokotlin.model.Chat

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))
        refreshAdapter(getAllChats())
    }

    private fun refreshAdapter(chats: ArrayList<Chat>){
        val adapter = ChatAdapter(this, chats)
        recyclerView!!.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.mipmap.muslim, "Muslim", 2))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 0))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 3))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 8))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 34))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 21))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 2))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 9))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 4))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 5))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 27))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 12))
        chats.add(Chat(R.mipmap.muslim, "Muslim", 32))

        return chats
    }
}