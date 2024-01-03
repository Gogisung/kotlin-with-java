package com.lannstark.lec04;


fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    
    if(money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val str = "ABC"
    println(str[2]) // C

    val money3 = Money(1_000L)
    val money4 = Money(2_000L)
    println(money3 + money4)

    // true
    if(fun1() || fun2()) {
        println("본문")
    }

}
fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}