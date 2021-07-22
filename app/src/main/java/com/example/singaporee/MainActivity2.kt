package com.example.singaporee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.londonx.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.londonx)
        btn.setOnClickListener{
          val intent = Intent(this, MainActivity::class.java)
            var text=edit1.text.toString()
            if(text.isNotEmpty()) {
                intent.putExtra("at", text)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Polyani toltirin", Toast.LENGTH_LONG).show()
            }
        }
    }
}