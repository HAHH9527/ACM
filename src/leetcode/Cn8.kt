package leetcode

import java.math.BigInteger

object Cn8 {
    class Solution {
        fun myAtoi(s: String): Int {
            val sList = s.toCharArray().toMutableList()
            var ret = ""
            var intStart = false

            sList.forEach {
                when {
                    intStart -> {
                        if (it in '0'..'9') {
                            intStart = true
                            ret += it
                        } else {
                            return ret.strToInt()
                        }
                    }

                    it == ' ' -> {}
                    it == '-' || it == '+' || it in '0'..'9' -> {
                        intStart = true
                        if (it != '+') ret += it
                    }

                    else -> return 0
                }
            }

            return ret.strToInt()
        }

        private fun String.strToInt(): Int {
            try {
                return toInt()
            } catch (e: NumberFormatException) {
                val l = toBigIntegerOrNull() ?: BigInteger.ZERO
                if (l > Int.MAX_VALUE.toBigInteger()) return Int.MAX_VALUE
                if (l < Int.MIN_VALUE.toBigInteger()) return Int.MIN_VALUE
                return 0
            }
        }
    }

    val s = Solution()

    private fun test(input: String, output: Int) {
        val ans = s.myAtoi(input)
        if (ans != output) {
            println("error: in:$input out:$output $ans != $output")
        } else {
            println("success: in:$input out:$output")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        test("42", 42)
        test("   -42", -42)
        test("4193 with words", 4193)
        test("-123", -123)
        test("--11", 0)
        test("-91283472332", Int.MIN_VALUE)
        test("+1", 1)
        test("20000000000000000000", Int.MAX_VALUE)
        test("    +11191657170", Int.MAX_VALUE)
    }
}