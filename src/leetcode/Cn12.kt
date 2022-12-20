package leetcode

object Cn12 {
    val s = Solution()

    @JvmStatic
    fun main(args: Array<String>) {
        test(3, "III")
        test(4, "IV")
        test(9, "IX")
        test(58, "LVIII")
        test(1994, "MCMXCIV")
    }

    private fun test(input: Int, output: String) {
        if (s.intToRoman(input) != output) {
            println("$input != $output")
        }
    }

    class Solution {
        fun intToRoman(num: Int): String {
            val unit = listOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX") // 下标所对应的元素即个位表示的罗马字符
            val tens = listOf("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC") // 下标所对应的元素即十位表示的罗马字符
            val hund = listOf("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM") // 下标所对应的元素即百位表示的罗马字符
            val thou = listOf("", "M", "MM", "MMM") // 下标所对应的元素即千位表示的罗马字符
            return thou[num / 1000] + hund[num % 1000 / 100] + tens[num % 100 / 10] + unit[num % 10]
        }
    }
}