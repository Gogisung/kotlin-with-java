package com.lannstark.lec03;

fun main() {
  val number1 = 3 // Int
  val number2 = 3L // Long

  val number3 = 3.0f // Float
  val number4 = 3.0 // Double

}

fun printAgeIfPerson(obj: Any) {
  if(obj is Person) {
    val person = obj as Person
    println(person.age)
  }
}

fun fail(message: String): Nothing {
  throw IllegalArgumentException(message)
}
