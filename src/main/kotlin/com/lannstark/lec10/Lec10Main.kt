package com.lannstark.lec10

/**
 * 1. final: override를 할 수 없게 한다. default로 보이지 않게 존재한다.
 * 2. open: override를 열어 준다.
 * 3. abstract: 반드시 override 해야 한다.
 * 4. override: 상위 타입을 오버라이드 하고 있다.
 *
 */

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {

    init {
        println("Derived Class")
    }

}

