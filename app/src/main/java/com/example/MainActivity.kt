package com.example

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        try {
            val audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
            // Show system volume slider overlay without changing actual volume
            audioManager.adjustStreamVolume(
                AudioManager.STREAM_MUSIC,
                AudioManager.ADJUST_SAME,
                AudioManager.FLAG_SHOW_UI
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // Close immediately to prevent any application user interface from loading
        finish()
    }
}
