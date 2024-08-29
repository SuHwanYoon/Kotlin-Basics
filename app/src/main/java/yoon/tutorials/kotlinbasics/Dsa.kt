package yoon.tutorials.kotlinbasics

fun main(){
    //불변 리스트
    val shoppingList1= listOf("cpu","ram","gpu 3060","ssd")
    //가변 리스트
    val shoppingList2 =mutableListOf("cpu","ram","rtx 3060","ssd")
    shoppingList2.add("cooling system")
    shoppingList2.remove("rtx 3060")
    shoppingList2.add("rtx 4090")
    println(shoppingList2)
    shoppingList2[4] = "amd 7800"
    println(shoppingList2)
    shoppingList2.set(3,"water cooling")
    val hasRam = shoppingList2.contains("ram")
    if (hasRam){
        println("Has Ram in List")
    }else{
        println("No Ram in List")
    }
    //for in loop
    for (shoppingItem in shoppingList2){
        println(shoppingItem)
        if (shoppingItem == "ram"){
            shoppingList2.removeLast()
            println("Loop Break!")
            break
        }
    }
    println(shoppingList2.size)
    //for in untill  loop
    //0<= untill < 4
    for (shoppingIndex in 0 until shoppingList2.size){
        println("index $shoppingIndex is ${shoppingList2[shoppingIndex]}")
    }
    //0..3
    for (shoppingIndex in 0..3){
        println("index $shoppingIndex is ${shoppingList2[shoppingIndex]}")
    }
    println(shoppingList2)
}
