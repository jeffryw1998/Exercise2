package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonCalculate).setOnClickListener{
            BMI()
        }
    }


    private fun BMI (){
        var weight : Float = editTextWeight.text.toString().toFloat()
        var height : Float = editTextHeight.text.toString().toFloat()

        height = height / 100

        var bmi : Float = weight / (height*height)

        if(bmi < 18.5)
        {
            imageViewProfile.setImageResource(R.drawable.under)
            textViewBMI.setText(bmi.toString())
        }

        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            imageViewProfile.setImageResource(R.drawable.normal)
            textViewBMI.setText(bmi.toString())
        }
        else if (bmi > 25)
        {
            imageViewProfile.setImageResource(R.drawable.over)
            textViewBMI.setText(bmi.toString())
        }

    }
}
