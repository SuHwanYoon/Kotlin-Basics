package yoon.tutorials.kotlinbasics.inheritanceapp

fun main (){
    // Parents클래스 객체 생성후 호출
//    val parentsObj = Parents()
//    parentsObj.parentsFunction()

    //상속을 받은 child 클래스 객체 생성후 호출
    //자식은 부모의 함수를 호출할수있다
    val childObj = Child()
    childObj.parentsFunction()//This is parentsFunction!
    childObj.role()//This is Child Role!

    // 상속은 받았지만 구현을 하지않은(역할이 없는) 둘째 아이
    val secondChildObj = SecondChild()
    secondChildObj.role()//This is Parents Role!

    // 상속을 받고 자신의 역할을 구현한 셋째 아이
    val thirdChild = ThirdChild()
    thirdChild.role()//This is ThirdChild Role!!




}