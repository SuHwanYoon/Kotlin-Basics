package yoon.tutorials.kotlinbasics.inheritanceapp

//셋째 아이에게 상속받는 친척아이
//셋째 아이는 친척에게 IOS,AOS기술을 implement해서 친척이 사용할수있게 해준다
class Cousin : ThirdChild(),AosEngineer,IosEngineer {

    //인터페이스 AosEngineer의 함수를 사용하기 위해 override
    override fun kotlinCoding() {
        //상속클래스의 인터페이스를 사용
        super.kotlinCoding()
        //인터페이스 사용과 함께 자신의 함수도 사용
        println("Kotlin skills enhanced by Cousin")
    }


    //인터페이스 IosEngineer의 함수를 사용하기 위해 override
    override fun swiftCoding() {
        super.swiftCoding()
        println("Swift skills enhanced by Cousin")
    }

}