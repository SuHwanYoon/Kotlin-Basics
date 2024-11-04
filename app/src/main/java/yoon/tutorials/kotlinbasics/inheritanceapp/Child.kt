package yoon.tutorials.kotlinbasics.inheritanceapp

//Parents class 상속 ()를 붙여줘야한다
class Child : Parents(){

    //상위 클래스에서 open한 메서드를 override해서 사용
    override fun role() {
//        super.parentsRole()
        println("This is Child Role!")
    }
}