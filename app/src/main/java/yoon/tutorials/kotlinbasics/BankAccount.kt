package yoon.tutorials.kotlinbasics

class BankAccount(var accountCostomer: String, var balance : Double) {
    //mutableListof는 자체적으로 ArrayList로 사용된다
    //만약 LinkedList를 사용하고싶다면 MutableList로 정의해줘야한다
    //초기 생설시 리스트 크기 0
    private val transactionHistory = mutableListOf<String>()

    //입금함수
    fun deposit(amount:Double){
        //건넨 잔액누적
        balance += amount
        //입금 내용을 기록
        transactionHistory.add("$accountCostomer (이)가 $$amount 를 입급했습니다")

    }

    //출금함수
    fun withdraw(amount: Double){
        //출금이 잔액보다 같거나 작으면
        if (amount <= balance) {
            //출금금액을 잔액에서 뺀다
            balance -= amount
            //출금 내용을 기록
            transactionHistory.add("$accountCostomer (이)가 $$amount 를 출금했습니다")
        }else{
            println("$amount 를 출금할 수 없습니다 잔액이 부족합니다")
        }
    }

    //입출금기록표시 함수
    fun displayTransctionHistory(){
        println("$accountCostomer 의 거래내역")
        //거래 내역 출력
        for (transaction in transactionHistory){
            println(transaction)
        }
    }

}