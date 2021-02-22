package com.shahrasul.youtubeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shahrasul.youtubeapp.R
import com.shahrasul.youtubeapp.data.Info
import com.shahrasul.youtubeapp.data.VideoInfo
import com.shahrasul.youtubeapp.ui.PlaylistViewModel
import kotlinx.android.synthetic.main.item_playlist.view.*

class PlaylistAdapter() :RecyclerView.Adapter<BaseViewHolder>(){
    var list = mutableListOf<Info>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_playlist,parent,false)
        return PlaylistViewHolder(view)
    }
    fun addItems(list: MutableList<Info>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

    }
    inner class PlaylistViewHolder(itemView: View): BaseViewHolder(itemView){
        override fun onBind(position: Int) {
            itemView.title.text = list[position].snippet?.title
            itemView.subtitle.text = list[position].snippet?.subtitle

        }
    }

}