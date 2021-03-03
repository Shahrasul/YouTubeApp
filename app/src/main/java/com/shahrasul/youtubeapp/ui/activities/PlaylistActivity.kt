package com.shahrasul.youtubeapp.ui.activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shahrasul.youtubeapp.R
import com.shahrasul.youtubeapp.ui.adapters.PlaylistAdapter
import com.shahrasul.youtubeapp.utils.isConnected
import kotlinx.android.synthetic.main.activity_playlist.*

class PlaylistActivity : AppCompatActivity() {
    private lateinit var adapter: PlaylistAdapter
    private lateinit var viewModel : PlaylistViewModel
    private val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist)
        if (!this.isConnected(this)){
            val intent = Intent(this, ErrorActivity::class.java)
            startActivity(intent)
        }
        viewModel = ViewModelProvider(this)[PlaylistViewModel::class.java]
        initAdapter()
        populateAdapter()
    }

    private fun populateAdapter() {
        viewModel.setPlaylists()
        viewModel.playlists.observe(this, Observer {
            adapter.addItems(it)
        })
    }

    private fun initAdapter() {
        adapter = PlaylistAdapter()
        layoutManager.orientation = RecyclerView.VERTICAL
        rv_playlist.layoutManager = layoutManager
        rv_playlist.itemAnimator = DefaultItemAnimator()
        rv_playlist.adapter = adapter
        rv_playlist.isNestedScrollingEnabled = true
    }

}