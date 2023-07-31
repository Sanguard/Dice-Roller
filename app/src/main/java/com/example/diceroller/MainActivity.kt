package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        // Do a dice roll when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {

        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val dice2 = Dice(6)
        val dice3 = Dice(6)
        val dice4 = Dice(6)
        val dice5 = Dice(6)
        val dice6 = Dice(6)

        val diceRoll = dice.roll()
        val diceRoll2 = dice2.roll()
        val diceRoll3 = dice3.roll()
        val diceRoll4 = dice4.roll()
        val diceRoll5 = dice5.roll()
        val diceRoll6 = dice6.roll()

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        val diceImage3: ImageView = findViewById(R.id.imageView3)
        val diceImage4: ImageView = findViewById(R.id.imageView4)
        val diceImage5: ImageView = findViewById(R.id.imageView5)
        val diceImage6: ImageView = findViewById(R.id.imageView6)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2 = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource3 = when (diceRoll3) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource4 = when (diceRoll4) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource5 = when (diceRoll5) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource6 = when (diceRoll6) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)
        diceImage3.setImageResource(drawableResource3)
        diceImage4.setImageResource(drawableResource4)
        diceImage5.setImageResource(drawableResource5)
        diceImage6.setImageResource(drawableResource6)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
        diceImage.contentDescription = diceRoll2.toString()
        diceImage.contentDescription = diceRoll3.toString()
        diceImage.contentDescription = diceRoll4.toString()
        diceImage.contentDescription = diceRoll5.toString()
        diceImage.contentDescription = diceRoll6.toString()
       }
    }



class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}