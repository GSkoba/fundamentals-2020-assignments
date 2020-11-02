package com.android.academy.fundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.title);

        textView.setOnClickListener {
            moveToNextScreen()
        }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(SecondActivity.tString, "transmitted string")
        intent.putExtra(SecondActivity.tInt, 10)
        intent.putExtra(SecondActivity.tBoolean, false)
        startActivity(intent)
    }
}
