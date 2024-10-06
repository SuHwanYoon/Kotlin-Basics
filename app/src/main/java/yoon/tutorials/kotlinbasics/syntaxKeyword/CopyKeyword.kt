package yoon.tutorials.kotlinbasics.syntaxKeyword

fun main(){
    
    //파란 장미무늬 꽃병
    val blueRoseVase = Vase(color = "blue", design = "Rose")
    //빨간 장미무늬 꽃병
    //객체를 copy해서 속성을 변경
    // 통제할수 없는 리스트나 데이터베이스에서 얻은 객체를 조작할때 copy메서드를 사용하는것이 유용하다
    val redRoseVase = blueRoseVase.copy(color = "red")
    println(blueRoseVase)
    println(redRoseVase)
    
}

//꽃병 객체
data class Vase(val color:String, val design:String)