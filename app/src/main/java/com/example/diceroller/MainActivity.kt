package com.example.diceroller

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** saves the reference to the Button object in a variable called rollButton
         * and finds the Button in the layout with its unique resource ID
         */
        val rollButton: Button = findViewById(R.id.dice_roller_btn)

        /**** Good coding practices ****/
        //rollButton.setOnClickListener { rollDice() }

        //set a click listener on rollButton object by calling the setOnClickListener() method
        rollButton.setOnClickListener {

            /** Create a Toast with the text "Dice Rolled!" by calling Toast.makeText() */
            // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)

            /** Toast displays itself by calling the show() method */
            // toast.show()

            // val resultTextView: TextView = findViewById(R.id.textView)
            // resultTextView.text = "6"

            /** Create a rollDice() method */
            rollDice()
        }
    }

    /**
     *  Create function ‘rollDice'. Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        /** Create new Dice object with 6 sides and roll it */

        /** Create a dice with 6 sides and Roll it by calling the roll() method,
         * and save the result in a variable called diceRoll
         */
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        /** Create a new variable called resultTextView to store the TextView
         * and use findViewById() to find textView in the layout using its ID, and store a reference to it
         */
        val resultTextView: TextView = findViewById(R.id.dice_roller_count)

        /** Convert diceRoll to a string and use that to update the text of the resultTextView */
        resultTextView.text = diceRoll.toString()
    }
}

/** Create the Dice class with a roll() method */
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}