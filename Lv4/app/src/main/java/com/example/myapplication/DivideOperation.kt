package com.example.myapplication

class DivideOperation : AbstractOperation() {
    override fun calculate (num1: Int, num2: Int) : Double = if (num2 != 0) (num1 / num2).toDouble()
    else {
        Double.NaN
    }
}