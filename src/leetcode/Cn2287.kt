package leetcode

import kotlin.math.min

object Cn2287 {
    class Solution {
        fun rearrangeCharacters(s: String, target: String): Int {
            val sMap = getCharCountMap(s)
            val targetMap = getCharCountMap(target)
            var ans = Int.MAX_VALUE
            targetMap.forEach { (c, num) ->
                val sCount = sMap.getOrDefault(c, 0)
                val count = sCount / num
                ans = min(ans, count)
            }

            return ans
        }

        private fun getCharCountMap(s: String): Map<Char, Int> {
            val map = mutableMapOf<Char, Int>()
            s.forEach {
                map[it] = map.getOrDefault(it, 0) + 1
            }
            return map
        }
    }

    val s = Solution()
    private fun test(s: String, target: String, output: Int) {
        val ans = this.s.rearrangeCharacters(s, target)
        if (ans != output) {
            println("error: in:$s $target out:$output ans:$ans")
        } else {
            println("success: in:$s $target out:$output")
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        test("ilovecodingonleetcode", "code", 2)
        test("abcba", "abc", 1)
        test("abbaccaddaeea", "aaaaa", 1)
    }
}