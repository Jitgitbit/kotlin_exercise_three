package com.example.emojidictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var layoutManager : GridLayoutManager
    lateinit var adapter : EmojiAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layoutManager = GridLayoutManager(this, 7)
        recyclerView.layoutManager = layoutManager

        adapter = EmojiAdapter(arrayListOf("😅","👍","😂","🔥","🤔","😃","😇","😎","🤓","🧐","😘","🙈","🥑","🏥","🏦","🏰","🌇","📺","🦠","🎉","🔒","💔","🛀","😜","🏁","🐈","🐑","🤥","🍍","🧿"))
        recyclerView.adapter = adapter
    }
}