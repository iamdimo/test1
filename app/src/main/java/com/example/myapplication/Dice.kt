package com.example.myapplication

class Dice (private val mySides : Int) {

   fun rollDice() : Int
    {

        val diceRange =  1..mySides ;
        val randomNumber = diceRange.random();
       return randomNumber

    }
}



