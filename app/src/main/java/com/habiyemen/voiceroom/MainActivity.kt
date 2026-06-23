package com.habiyemen.voiceroom

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMic = findViewById<Button>(R.id.btnMic)
        btnMic.setOnClickListener {
            Toast.makeText(this, "المايك شغال يا Habi Yemen! 🎤", Toast.LENGTH_SHORT).show()
        }
    }
}
