package com.example.hw_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_3_7.databinding.ItemMusicBinding

class MusicAdapter(val musicList: ArrayList<Music>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemMusicBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(musicList[position])
    }
}

class ViewHolder(val binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(music: Music) {
        binding.tvNum.text = music.numbering.toString()
        binding.tvName.text = music.name
        binding.tvAuthor.text = music.author
        binding.tvTime.text = music.musicTime.toString()

    }
}