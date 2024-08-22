package yoon.tutorials.kotlinbasics

//클래스 파라미터에 val,var을 붙여주면 접근가능한 property로 취급된다
//일반적으로는 변경되지않는 값을 주로 property로 사용하기에 val로 사용
//만약 변경되는 age같은 값을 사용한다면 property가 지정되지않았을 경우에 사용될 초기값을 지정
//빈 문자열을 받을수있기 때문에 String?로 지정
class Dog(val name: String, val breed: String, val age: Int) {

    //기본 생성자 호출후 호출되는 init
    init {
        bark()
    }

    private fun bark() {
        println("Bow Bow!")
    }
}