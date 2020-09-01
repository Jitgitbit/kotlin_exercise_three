package com.example.emojidictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmojiAdapter : RecyclerView.Adapter<EmojiAdapter.TextHolder> {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: TextHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        override fun onClick(p0: View?) {
            TODO("Not yet implemented")
        }
    }
}