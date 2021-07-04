package com.yago.diceroller

class Dice(val numSides: Int) {

    fun roll(): Int{
        return (1..numSides).random()
    }
}