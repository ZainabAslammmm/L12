package com.example.l12

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var play=findViewById(R.id.button) as Button
        var stop=findViewById(R.id.button2) as Button

        var mp=MediaPlayer()
        play.setOnClickListener{
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.music))
            mp.prepare()
            mp.start()
        }

        stop.setOnClickListener {
            mp.stop()
            mp.release()
            mp=MediaPlayer()
        }
    }
}