package yoon.tutorials.kotlinbasics

fun main() {
    var age = 0;
    println("당신의 나이를 입력하세요")


    val enteredValues = readln()
    age = enteredValues.toInt()

    if (age in 18..39) {
        println("출입이 가능합니다")
    } else if (age >= 40) {
        println("나이가 많아서 출입 불가능합니다")
    } else {
        println("출입이 불가능합니다")
    }


}