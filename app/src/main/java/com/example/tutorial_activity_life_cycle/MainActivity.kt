package com.example.tutorial_activity_life_cycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showText("create")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        showText("start")
    }

    override fun onResume() {
        super.onResume()
        showText("resume")
    }

    override fun onPause() {
        super.onPause()
        showText("pause")
    }

    override fun onStop() {
        super.onStop()
        showText("stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        showText("destroy")
    }

    private fun showText(state: String) {
        Log.d("TEST_LIFE_CYCLE", "MainActivity $state")
    }
}