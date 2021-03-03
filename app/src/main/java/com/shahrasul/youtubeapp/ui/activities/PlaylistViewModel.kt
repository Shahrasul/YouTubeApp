package com.shahrasul.youtubeapp.ui.activities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shahrasul.youtubeapp.data.model.PlaylistInfo
import com.shahrasul.youtubeapp.utils.App

class PlaylistViewModel : ViewModel() {
    var playlists = MutableLiveData<MutableList<PlaylistInfo.PlaylistItem>>()
    fun setPlaylists() {
        playlists = App.repository.loadPlaylists()
    }
}