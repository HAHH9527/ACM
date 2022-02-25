package leetcode

object Cn537 {
    class Solution {
        fun complexNumberMultiply(num1: String, num2: String): String {
            val (a, b) = num1.dropLast(1).split("+").map { it.toInt() }
            val (c, d) = num2.dropLast(1).split("+").map { it.toInt() }
            return "${a * c - b * d}+${a * d + b * c}i"
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(Solution().complexNumberMultiply("1+1i", "1+1i"))
    }
}
