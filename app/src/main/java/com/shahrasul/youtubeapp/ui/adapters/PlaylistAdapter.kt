package com.shahrasul.youtubeapp.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shahrasul.youtubeapp.R
import com.shahrasul.youtubeapp.data.model.PlaylistInfo
import com.shahrasul.youtubeapp.utils.setImageFromUrl
import kotlinx.android.synthetic.main.item_playlist.view.*

class PlaylistAdapter() :RecyclerView.Adapter<BaseViewHolder>(){
    var list = mutableListOf<PlaylistInfo.PlaylistItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_playlist,parent,false)
        return PlaylistViewHolder(view)
    }
    fun addItems(list: MutableList<PlaylistInfo.PlaylistItem>) {
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }


    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.onBind(position)

    }
    inner class PlaylistViewHolder(itemView: View): BaseViewHolder(itemView){
        override fun onBind(position: Int) {
            itemView.apply {
                title.text = list[position].snippet?.title
                subtitle.text = list[position].snippet?.description
                itemView.iv_main.setImageFromUrl(list[position].snippet?.thumbnails?.medium?.url, itemView.iv_main)
            }

        }
    }

}