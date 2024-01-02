package com.lannstark.lec02;

fun main() {
  val str: String? = "ABC"
  //  println(str.length) // 불가능
  println(str?.length) // 가능
  /**
   * Safe Call
   * null이 아니면 실행하고,
   * null이면 실행하지 않는다.(그대로 null)
   */
  println(startsWith("ASD"))

  val person = Person("공부하는 개발자")
  startsWidthA(person.name)
}

fun startsWidthA(str: String): Boolean {
  return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
  return str?.startsWith("A")
    ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
  return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
  return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
  // !! 절대 널이 아니다.
  return str!!.startsWith("A")
}

