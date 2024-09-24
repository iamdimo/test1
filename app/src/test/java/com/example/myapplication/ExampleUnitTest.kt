package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
   @Test
   fun generate_number ()
   {
       repeat(4)
       {
           val dice = Dice(6);
           val randomNumber = dice.rollDice();
           assertTrue(randomNumber in 2..4)
       }

   }
}