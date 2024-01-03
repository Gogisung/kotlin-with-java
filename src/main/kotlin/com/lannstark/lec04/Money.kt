package com.lannstark.lec04

/**
 * @author gisung.go
 * @since 2024-01-03
 * */
data class Money(val amount: Long) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }
}