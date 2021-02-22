package com.shahrasul.youtubeapp.data

import android.icu.text.IDNA

data class VideoInfo(val items: MutableList<Info>)
    data class Info(
        var id: String?=null,
        var snippet: Snippet?=null
    )
    data class Snippet(
        var channelId: String?=null,
        var title: String?=null,
        var description: String?=null,
        var thumnails: Thumbnails?=null,
        var channelTitle: String?=null
    )
    data class Thumbnails(
        var medium: Medium?=null
    )
    data class Medium(
        var url: String?=null,
        var width: String?=null,
        var heith: String?=null
    )

