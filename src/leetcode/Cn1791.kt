package leetcode

object Cn1791 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        val array = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2))
        println(s.findCenter(array))
    }

    class Solution {
        fun findCenter(edges: Array<IntArray>): Int {
            return if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
                edges[0][0]
            } else edges[0][1]
        }
    }
}