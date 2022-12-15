package leetcode

object Cn1945 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        println(s.getLucky("iiii", 1))
        println(s.getLucky("leetcode", 2))
        val z100 = buildString {
            (1..100).forEach { _ ->
                append('z')
            }
        }
        println(s.getLucky(z100, 1))
        println(s.getLucky(z100, 2))
        println()
        println(s.getLucky("zzzzzzzzzzzzzzzzzzzzzzzzzza", 1))
        println(s.getLucky("zzzzzzzzzzzzzzzzzzzzzzzzzza", 2))
        println(s.getLucky("zzzzzzzzzzzzzzzzzzzzzzzzzza", 3))
    }

    class Solution {
        companion object {
            const val a: Char = 'a' - 1
        }

        fun getLucky(s: String, k: Int): Int {
            val chars = s.toCharArray()
            var sum = 0
            chars.forEach { c ->
                sum += getSum(c - a)
            }

            (1 until k).forEach {
                sum = getSum(sum)
            }

            return sum
        }

        private fun getSum(i: Int): Int {
            var t = i
            var sum = 0
            while (t > 9) {
                sum += t % 10
                t /= 10
            }
            return sum + t
        }
    }
}