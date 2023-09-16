package com.example.myapplication

fun main (){

    println("첫 번째 숫자를 입력해주세요.")
    val num1 = readLine()!!.toInt()

    println("연산자를 선택해주세요")
    val operator = readLine()

    println("두 번째 숫자를 입력해주세요.")
    val num2 = readLine()!!.toInt()

    val result = when(operator) {
        "+" -> AddOperation().calculate(num1, num2)
        "-" -> SubstractOperation().calculate(num1, num2)
        "*" -> MultiplyOperation().calculate(num1, num2)
        "/" -> DivideOperation().calculate(num1, num2)
        else -> {
            println("잘못된 연산자입니다.")
            return
        }
    }
    println(" 답 : $num1 $operator $num2 = ${result}입니다.")
}