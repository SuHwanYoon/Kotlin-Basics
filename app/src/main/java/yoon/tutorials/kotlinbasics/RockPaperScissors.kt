package yoon.tutorials.kotlinbasics

fun main(){
    var computer = ""
    var player = ""
    println("가위바위보 게임 Rock,Paper,Scissors 중 하나를 입력하세요")

    player = readln()

    when ((1..3).random()) {
        1-> {
            computer = "Rock"
        }
        2->{
            computer = "Paper"
        }
        3->{
            computer = "Scissors"
        }
    }
    println("플레이어의선택:$player")
    println("컴퓨터의 선택:$computer")

    val winner = when{
        player == computer -> "Tie"
        player == "Rock" && computer == "Scissors" -> "Player"
        player == "Paper" && computer == "Rock" -> "Player"
        player == "Scissors" && computer == "Paper" -> "Player"
        //플레이어가 틀린값을 입력했을 경우는 승자를 컴퓨터로  ex) Rockkkk를 입력
        else -> "Computer"
    }

    if (winner == "Tie"){
        println("무승부 입니다")
    }else{
        println("승자는 $winner 입니다")
    }
}
