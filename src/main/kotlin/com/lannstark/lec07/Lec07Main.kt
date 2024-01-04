package com.lannstark.lec07

import java.lang.NumberFormatException


fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str:String): Int? {
    return try { // 하나의 Expression 이기 때문에 return 가능
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}