package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    fun main() {
        println("계산방법를 입력하세요")
        println("1. 덧셈")
        println("2. 뺄셈")
        println("3. 몫 연산")
        println("4. 나머지 연산")

        val selectCalculation = readLine()!!.toInt()
        when (selectCalculation) {
            1 -> println("덧셈")
            2 -> println("뺄셈")
            3 -> println("몫 연산")
            4 -> println("나머지 연산")
        }
    }
