package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener {
            var weight: Double = weightTxt.text.toString().toDouble()
            var height: Double = weightTxt.text.toString().toDouble()
            var bmi:Double = weight/(height*height)
            resultText.text = "Your Body mass Index is $bmi"

            if(bmi>23)
                Toast.makeText(this,"Your are overWeight",Toast.LENGTH_SHORT).show()


        }

    }
}