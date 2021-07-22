package com.example.singaporee

import android.app.PendingIntent.getActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_songi.*
import kotlinx.android.synthetic.main.londonx.*

class songiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songi)
        val score = intent.getIntExtra("score", 0)
        tvScore.text = "$score/6"
        val ati = intent.getStringExtra("at")
         songiText.text = "$ati"

    }
}