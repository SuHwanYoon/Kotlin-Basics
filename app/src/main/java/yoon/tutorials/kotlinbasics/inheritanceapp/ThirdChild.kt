package yoon.tutorials.kotlinbasics.inheritanceapp

//상위 클래스를 상속하면서 자신의 함수를 구현
open class ThirdChild : Parents(){

    override fun role() {
        println("This is ThirdChild Role!!")
    }
}