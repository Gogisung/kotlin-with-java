package com.lannstark.lec09

import java.lang.IllegalArgumentException

fun main () {
    val person = Person("gisung", 100)
    println(person.name)
    person.age = 10
    println(person.age)
}

class Person(
    name: String,
    var age: Int
) {
    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if(age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부생성자")
    }
    constructor(): this("홍길동") {
        println("두번째 부생성자")
    }

    //    fun isAdult(): Boolean {
    //        return this.age >= 20
    //    }

    val isAdult: Boolean
        get() = this.age >= 20
}

/**
 *  class Person constructor(name: String, age: Int) {
 *  //     getter와 setter는 자동으로 만들어 준다.
 *      val name: String = name
 *      var age: Int = age
 *  }
 */
