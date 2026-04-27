package com.example.exaudiapps.pertemuan5

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import com.example.exaudiapps.databinding.ActivityVideoBinding

class VideoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Link Video (Contoh video sampel MP4)
        val videoUrl = "https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4"
        val uri = Uri.parse(videoUrl)
        binding.videoView.setVideoURI(uri)

        // 2. Tambahkan Controller (Tombol Play, Pause, Stop)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.setMediaController(mediaController)

        // 3. Jalankan Video
        binding.videoView.start()
    }
}