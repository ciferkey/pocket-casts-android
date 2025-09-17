package au.com.shiftyjelly.pocketcasts.repositories.playlist

data class PlaylistPreview(
    val uuid: String,
    val title: String,
    val episodeCount: Int,
    val artworkPodcastUuids: List<String>,
    val type: Playlist.Type,
)

data class PlaylistPreviewForEpisode(
    val uuid: String,
    val title: String,
    val episodeCount: Int,
    val artworkPodcastUuids: List<String>,
    val hasEpisode: Boolean,
    val episodeLimit: Int,
) {
    val canAddOrRemoveEpisode get() = hasEpisode || episodeCount < episodeLimit
}
