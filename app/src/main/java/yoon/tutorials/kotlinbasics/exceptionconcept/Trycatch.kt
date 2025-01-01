package yoon.tutorials.kotlinbasics.exceptionconcept

fun main() {
    //변수 초기화
    var number: Int = 0
    println("Please Enter a number")

    //Int를 입력받는 변수 숫자가 아니면 Exception 발생
    try {
        // 입력값을 담는 불변변수
        val inputNumber = readln().toInt()
        // 유효한 경우에만 입력값을 넣기
        number = inputNumber
        println("User entered $number")
    } catch (error: Exception) {
        println("Error: ${error.message}")
    } finally {
        println("This is finally code")
        // 예외가 발생했을 경우도 아닌경우도 number를 0으로 초기화해서 프로그램을 끝내기
        // 항상초기화된 상태를 보장
        // null 또는 미초기화 상태를 방지
        // 이경우는 유효한 입력값도 0 으로 덮어짐
        // number = 0
    }
}