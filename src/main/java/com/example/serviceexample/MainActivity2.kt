package com.example.serviceexample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity(){
    lateinit var btnStop:Button
    lateinit var btnStart:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStop = findViewById(R.id.btnstop)
        btnStart = findViewById(R.id.btnstart)



        btnStart.setOnClickListener {

            var intent = Intent(this, MusicService::class.java)
//                startService(Intent(this, MusicService::class.java))
            startService(intent)


        }

        btnStop.setOnClickListener {

            var intent = Intent(this, MusicService::class.java)
//                startService(Intent(this, MusicService::class.java))
            stopService(intent)


        }

    }

}