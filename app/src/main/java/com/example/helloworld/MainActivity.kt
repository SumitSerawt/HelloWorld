package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloPikachu)
        button.setOnClickListener{
           Log.v("Hello world!", "Button clicked!")
           Toast.makeText(this, "Hello Pikachu! Let's play", Toast.LENGTH_SHORT).show()
        }
    }
}