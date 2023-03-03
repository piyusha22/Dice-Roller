package com.example.extradiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.dice_roller_btn)
        val rollCount1: TextView = findViewById(R.id.dice_roller_count1)
        val rollCount2: TextView = findViewById(R.id.dice_roller_count2)
        rollBtn.setOnClickListener{
            val diceNo1 = (1..6).random()
            rollCount1.text= "" + diceNo1
            val diceNo2 = (1..6).random()
            rollCount2.text = ""+diceNo2
        }
    }
}