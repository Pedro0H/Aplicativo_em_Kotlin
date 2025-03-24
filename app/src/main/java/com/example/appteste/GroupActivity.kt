package com.example.appteste

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class GroupActivity : AppCompatActivity() {
    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_group)

            button3 = findViewById(R.id.button3)
            button3.setOnClickListener {
                val intent = Intent(
                    this,
                    MainActivity::class.java
                )
                startActivity(intent)
        }
    }
}