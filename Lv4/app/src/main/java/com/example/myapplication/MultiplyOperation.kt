package com.example.myapplication

class MultiplyOperation : AbstractOperation() {
    override fun calculate (num1:Int, num2: Int) : Double = (num1 * num2).toDouble()
}