package com.lannstark.lec10

/**
 * @author gisung.go
 * @since 2024-01-06
 * */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
}