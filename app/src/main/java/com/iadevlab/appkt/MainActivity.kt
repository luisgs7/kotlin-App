package com.iadevlab.appkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var textApp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn_id)
        textApp = findViewById(R.id.text_id)

        btn.setOnClickListener {
            textApp.text = getString(R.string.city)
        }
    }

}