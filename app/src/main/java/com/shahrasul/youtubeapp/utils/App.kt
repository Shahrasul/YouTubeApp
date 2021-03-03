package com.shahrasul.youtubeapp.utils

import android.app.Application
import com.shahrasul.youtubeapp.data.repository.Repository

class App : Application() {
    companion object {
        lateinit var repository: Repository
    }

    override fun onCreate() {
        super.onCreate()
        repository = Repository()
    }

}