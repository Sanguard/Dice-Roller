package com.example.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number () {
        val Dice = Dice(6)
        val rollResult = Dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", rollResult in 1..6)

    }


}