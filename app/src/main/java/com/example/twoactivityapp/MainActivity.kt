package com.example.twoactivityapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var okayButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberEditText = findViewById(R.id.numberEditText)
        okayButton = findViewById(R.id.okayButton)
        resultTextView = findViewById(R.id.resultTextView)
        nextButton = findViewById(R.id.nextButton)


        okayButton.setOnClickListener {

            val number = numberEditText.text.toString()
            if (number.isNotEmpty()) {
                resultTextView.text = number
            } else {
                numberEditText.error = "Please enter a number"
            }
        }


        nextButton.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}