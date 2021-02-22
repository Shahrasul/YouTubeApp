package com.shahrasul.youtubeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shahrasul.youtubeapp.data.Info
import com.shahrasul.youtubeapp.data.Snippet
import com.shahrasul.youtubeapp.ui.adapters.PlaylistAdapter
import kotlinx.android.synthetic.main.playlist_fragment.*

class PlaylistActivity : AppCompatActivity() {
    private lateinit var adapter: PlaylistAdapter
    private val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAdaper()
        populateAdapter()
    }

    private fun populateAdapter() {
        val testSnippet = Snippet(title = "Название текста", description = "Описание текста")
        val test = Info("1",testSnippet)

        var testSnippet2 = Snippet(title = "Назвоние текста" , description = "Описание текста")
        var test2 = Info()
    }

    private fun initAdaper() {
        adapter = PlaylistAdapter()
        layoutManager.orientation = RecyclerView.VERTICAL
        rv_playlist.layoutManager = layoutManager
        rv_playlist.itemAnimator = DefaultItemAnimator()
        rv_playlist.adapter = adapter
        rv_playlist.isNestedScrollingEnabled = true

    }
}