package com.example.extradiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** saves the reference to the Button and roll count object in a variable called rollBtn, rollCount1,
         * rollCount2 respectively and finds them in the layout with its unique resource ID
         */
        val rollBtn: Button = findViewById(R.id.dice_roller_btn)
        val rollCount1: TextView = findViewById(R.id.dice_roller_count1)
        val rollCount2: TextView = findViewById(R.id.dice_roller_count2)

        /** set a click listener on rollButton object by calling the setOnClickListener() method */
        rollBtn.setOnClickListener {

            /** Generates two random numbers between 1 and 6 (inclusive) representing dice rolls
             * The first & second random number is displayed in a text view called
             * rollCount1 and rollCount2 respectively
             */
            val diceNo1 = (1..6).random()
            rollCount1.text = "" + diceNo1
            val diceNo2 = (1..6).random()
            rollCount2.text = "" + diceNo2
        }
    }
}