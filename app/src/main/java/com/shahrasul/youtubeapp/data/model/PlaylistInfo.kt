package com.shahrasul.youtubeapp.data.model

data class PlaylistInfo(val items: MutableList<PlaylistItem>) {
    data class PlaylistItem(
        var id: String,
        var snippet: Snippet? = null,
        var playlistId: String? = null,
        var contentDetails: ContentDetails? = null,
        var startTime: Float = 0f
    )

    data class ContentDetails(
        var videoId: String? = null,
        var itemCount: Int? = null
    )

    data class Snippet(
        var title: String? = null,
        var thumbnails: ImageInfo? = null,
        var channelTitle: String? = null,
        var description: String? = null
    )

    data class ImageInfo(
        var medium: Medium? = null
    )

    data class Medium(
        var url: String? = null
    )

}