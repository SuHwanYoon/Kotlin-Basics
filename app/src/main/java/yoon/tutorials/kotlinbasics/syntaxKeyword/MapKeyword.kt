package yoon.tutorials.kotlinbasics.syntaxKeyword

fun main(){

    val numbers = listOf(1,2,3)
    val doubles = numbers.map { it * 2 }
    println(doubles)
}