package com.flannery.playpauseviewdemo

import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.flannery.PlayPauseView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val playPauseView = findViewById<PlayPauseView>(R.id.playPauseView)
        val toggle = findViewById<CheckBox>(R.id.toggle)
        toggle.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                playPauseView.play()
            } else {
                playPauseView.pause()
            }
        }
    }
}