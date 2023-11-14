package leetcode

object Cn13 {
    class Solution {
        fun romanToInt(s: String): Int {
            var sum = 0
            var preNum = getValue(s[0])
            for (i in 1 until s.length) {
                val num = getValue(s[i])
                if (preNum < num) {
                    sum -= preNum
                } else {
                    sum += preNum
                }
                preNum = num
            }
            sum += preNum
            return sum
        }

        private fun getValue(ch: Char): Int {
            return when (ch) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }
    }
}