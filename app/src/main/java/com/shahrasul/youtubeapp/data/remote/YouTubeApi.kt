package com.shahrasul.youtubeapp.data.remote

import android.telecom.Call
import com.shahrasul.youtubeapp.data.model.PlaylistInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeApi {
    @GET("youtube/v3/playlists")
    fun getPlaylists(
        @Query("part") part: String,
        @Query("channelId") channelId: String,
        @Query("key") key: String
    ): retrofit2.Call<PlaylistInfo>
}