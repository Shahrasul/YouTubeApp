package com.shahrasul.youtubeapp.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://www.googleapis.com/"

class RetrofitClient {
    companion object {
        private lateinit var apiInstance: YouTubeApi

        fun getInstance(): YouTubeApi {
            apiInstance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(YouTubeApi::class.java)
            return apiInstance
        }
    }
}