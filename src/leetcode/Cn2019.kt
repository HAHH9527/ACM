package leetcode

object Cn2019 {
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()
        println("'${solution.addSpaces("spacing", intArrayOf(0, 1, 2, 3, 4, 5, 6))}'")
    }

    class Solution {
        fun addSpaces(s: String, spaces: IntArray): String {
            val builder = StringBuilder()
            var lastIndex = 0
            for (space in spaces) {
                builder.append(s.substring(lastIndex until space))
                builder.append(" ")
                lastIndex = space
            }
            builder.append(s.substring(spaces.last()))
            return builder.toString()
        }
    }
}