package yoon.tutorials.kotlinbasics

fun main(){
    println("Enter your dog name")
    val dogName: String = readln()
    println("Enter your dog  breed")
    val dogBreed: String = readln()
    //개의 나이 입력
    println("Enter your dog age")
    val inputAge = readln()
    //입력나이 검증
    val dogAge = parseAge(inputAge)
    //kotlin은 new키워드를 사용하지 않음
    val myDog = Dog(dogName,dogBreed,dogAge)
    //객체 참조로 getter , setter역할의 property를 사용할수있다
    println("${myDog.name} is a ${myDog.breed} and is ${myDog.age} years old")
}

// age 입력검증 처리 함수
fun parseAge(input: String): Int {
    //1.입력 문자열을 Int로 변환하고 변환실패시(숫자변환불가문자,빈문자열) null 반환
    //2.입력한 나이(String)값을 takeif 기본 predicate인 it으로 로직검증
    //3. it이 0보다 클경우 해당값을 setting
    //4. it이 그외의 경우로 판단될었을 경우 run 블록 범위의 로직을 적용
    //5. 여기서는 메세지를 출력하고 0값을 setting하는 run 블록을 적용
    return input.toIntOrNull()?.takeIf { it > 0 } ?: run {
        println("부적절한 값입니다. 기본값을 입력합니다.")
        0
    }
}