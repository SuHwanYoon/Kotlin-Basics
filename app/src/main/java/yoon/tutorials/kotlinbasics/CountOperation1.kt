package yoon.tutorials.kotlinbasics

fun main () {
    var count1 = 0
    var count2 = 0
    while (count1 < 3){
        println("count1 is $count1")//[0,1,2]    ,  3-출력X
        count1++//0,1,2,3-변수마지막값
    }
    while (count2< 3){
        count2++//0-출력X,1,2,3-변수마지막값
        println("count2 is $count2")//0-출력X , [1,2,3]
    }
    println("Loop1&2 is Done!!")
    println("Loop1 is done when count is $count1")//3
    println("Loop2 is done when count is $count2")//3
}