package yoon.tutorials.kotlinbasics

fun main() {
    println("Enter Num1")
    val num1Str = readln().toInt()
    println("Enter Num2")
    val num2Str = readln().toInt()
    val addResult: Int = calAdd(num1Str, num2Str)
    val divideResult = calDivide(num1Str, num2Str)
    println("The addResult is $addResult")
    println("The divideResult is $divideResult")

//    makeCoffee(1, "yoon")
//    makeCoffee(2, "kim")
//    makeCoffee(3, "lee")
//    makeCoffee(0, "park")
//    makeCoffee(-1, "choi")
}

fun calAdd(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun calDivide(num1: Int, num2: Int): Double {
    return num1 / num2.toDouble()//둘중하나라도 Double로바꾸면 Dobule타입 리턴 가능
}

fun orderCoffeeDetails() {
    println("Please Enter Name")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    //입력 String Int 전환
    val sugarCountInt = sugarCount.toInt()

    makeCoffee(sugarCountInt, name)
}


fun makeCoffee(sugarCount: Int, name: String) {
    when (sugarCount) {
        //설탕 1스푼 케이스
        1 -> println("make Coffee with $sugarCount spoon of sugar for $name")
        //설탕없는 케이스
        0 -> println("make Coffee with no sugar for $name")
        // 나머지 케이스
        else -> println("make Coffee with $sugarCount spoons of sugar for $name")

    }
}


//fun makeCoffee(sugarCount: Int, name : String) {
//    if (sugarCount == 1) {
//        println("make Coffee with $sugarCount spoon of sugar for $name")
//    } else if(sugarCount == 0){
//        println("Coffee with no sugar for $name")
//    }else {
//        println("make Coffee with $sugarCount spoons of sugar for $name")
//
//    }
//
//}
