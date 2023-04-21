package com.iadevlab.appkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn_id)
        var text_app = findViewById<TextView>(R.id.text_id)

        btn.setOnClickListener({ view ->
            text_app.setText("Araguaína")
        })
    }

}