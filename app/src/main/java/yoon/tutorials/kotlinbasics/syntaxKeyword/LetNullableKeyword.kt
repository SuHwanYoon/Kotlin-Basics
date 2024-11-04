package yoon.tutorials.kotlinbasics.syntaxKeyword

fun main(){

    //nullable String
    val name : String? = "yoon";
    //안전한 호출을 위해 ?.를 사용
    //?.let을 통해서 null이 아닐경우에만 let범위의 함수가 실행되도록 한다
    name?.let {
        println(it.uppercase())
    }
}