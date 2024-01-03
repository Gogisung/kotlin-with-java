package com.lannstark.lec05

/**
 * @author gisung.go
 * @since 2024-01-03
 * */
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}

fun validataScore(score: Int) {
    if(score !in 0..100) {
        throw IllegalArgumentException("${score} 범위는 0부터 100입니다.")
    }
}


fun getPassOrFail(score: Int): String {
    return if(score >= 50) {
        "P"
    } else {
        "F"
    }
}

private fun getGradeWithSwitch(score: Int): String? {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

private fun getGradeWithSwitchIn(score: Int): String? {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "B"
        else -> "D"
    }
}

