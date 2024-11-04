package yoon.tutorials.kotlinbasics.inheritanceapp

//상속을 위해서 부모 클래스에 open키워드 사용
open class Parents {


    //메서드 오버라이드 허용하는 open키워드
    open fun role(){
        println("This is Parents Role!")
    }

    fun parentsFunction(){
        println("This is parentsFunction!")
    }
}