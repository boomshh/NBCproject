package com.example.myapplication

class AddOperation : AbstractOperation() {
    override fun calculate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()

}