package yoon.tutorials.kotlinbasics

fun main() {
    println("Please enter a number")

    // 사용자 입력을 숫자로 변환
    val userInput = readln().toInt()

    // userInput 변수에 입력한 숫자만큼 반복 for in 구문
    for (i in 1..userInput) {
        println("Loop is executed $i times")
    }

    println("Loop is done!!!")
}
