package mening.dasturim.spotlight.ui.main.user.club.course

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import mening.dasturim.spotlight.R

class CourseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     val view =  inflater.inflate(R.layout.fragment_course, container, false)


        // Inflate the layout for this fragment
        val youtubeId = ("Ww1DeUSC94o").split("=")
       view.findViewById<YouTubePlayerView>(R.id.youtube_player_view).addYouTubePlayerListener(object :
            AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                val videoId = youtubeId[youtubeId.size - 1]
                youTubePlayer.loadVideo(videoId, 0F)
            }
        })
        // Inflate the layout for this fragment
        val youtubeId2 = ("k9Jn0eP-ZVg").split("=")
       view.findViewById<YouTubePlayerView>(R.id.youtube_player_view2).addYouTubePlayerListener(object :
            AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                val videoId = youtubeId2[youtubeId2.size - 1]
                youTubePlayer.loadVideo(videoId, 0F)
            }
        })
        return view
    }
}