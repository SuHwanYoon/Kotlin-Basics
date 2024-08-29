package yoon.tutorials.kotlinbasics

fun main(){

    val yoonBankAccount = BankAccount("yoon", 12345.12)

    println(yoonBankAccount.accountCostomer)
    println("${yoonBankAccount.accountCostomer}'s banlance is ${yoonBankAccount.balance}")
    yoonBankAccount.deposit(200.0)
    yoonBankAccount.withdraw(300.0)
    yoonBankAccount.deposit(1000.0)
    yoonBankAccount.withdraw(2000.0)
    yoonBankAccount.displayTransctionHistory()
    println("${yoonBankAccount.accountCostomer}'s banlance is ${yoonBankAccount.balance}")

}