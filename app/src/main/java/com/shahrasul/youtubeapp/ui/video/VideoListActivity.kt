package com.shahrasul.youtubeapp.ui.video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.shahrasul.youtubeapp.R
import com.shahrasul.youtubeapp.ui.adapters.PlaylistAdapter
import com.shahrasul.youtubeapp.ui.adapters.VideoListAdapter

class VideoListActivity : AppCompatActivity() {
    lateinit var adapter: VideoListAdapter
    lateinit var viewModel : VideoListViewModel
    private val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videolist)
        viewModel = ViewModelProvider(this)[VideoListViewModel::class.java]
        initAdapter()
    }

    private fun initAdapter() {
        adapter = VideoListAdapter()

    }
}