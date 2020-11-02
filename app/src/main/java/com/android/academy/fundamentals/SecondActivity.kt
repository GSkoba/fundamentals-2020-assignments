package com.android.academy.fundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    companion object {
        const val tString = "tString"
        const val tInt = "tInt"
        const val tBoolean = "tBoolean"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.second_title)

        val tString = intent.getStringExtra(tString)
        val tInt = intent.getIntExtra(tInt, -1)
        val tBoolean = intent.getBooleanExtra(tBoolean, false)

        textView.text = "These values were passed from previous screen: transmittedString: $tString," +
                " transmittedInt: $tInt, transmittedBoolean: $tBoolean"

    }
}