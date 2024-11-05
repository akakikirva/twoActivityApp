package com.example.twoactivityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView
    private lateinit var clickButton: Button
    private var currentNumber = 10  // Starting number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        numberTextView = findViewById(R.id.numberTextView)
        clickButton = findViewById(R.id.clickButton)


        savedInstanceState?.let {
            currentNumber = it.getInt("current_number", 10)
            numberTextView.text = currentNumber.toString()
        }


        clickButton.setOnClickListener {

            currentNumber--
            numberTextView.text = currentNumber.toString()
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("current_number", currentNumber)
    }
}