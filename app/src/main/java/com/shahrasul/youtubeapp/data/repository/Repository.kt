package com.shahrasul.youtubeapp.data.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.shahrasul.youtubeapp.utils.Constanta.API_KEY
import com.shahrasul.youtubeapp.utils.Constanta.CHANNEL_ID
import com.shahrasul.youtubeapp.utils.Constanta.PART
import com.shahrasul.youtubeapp.data.model.PlaylistInfo
import com.shahrasul.youtubeapp.data.remote.RetrofitClient
import retrofit2.Call
import retrofit2.Response

class Repository {

    var playlistsLiveData: MutableLiveData<MutableList<PlaylistInfo.PlaylistItem>> = MutableLiveData()


    fun loadPlaylists(): MutableLiveData<MutableList<PlaylistInfo.PlaylistItem>> {
        RetrofitClient.getInstance().getPlaylists(PART, CHANNEL_ID, API_KEY)
            .enqueue(object : retrofit2.Callback<PlaylistInfo> {
                override fun onResponse(
                    call: Call<PlaylistInfo>,
                    response: Response<PlaylistInfo>
                ) {
                    val data = response.body()
                    val list = data!!.items
                    playlistsLiveData.value = list
                }

                override fun onFailure(call: Call<PlaylistInfo>, t: Throwable) {
                    Log.e("ololo", "onFailure: ${t.message}" )
                }
            })
        return playlistsLiveData
    }

}