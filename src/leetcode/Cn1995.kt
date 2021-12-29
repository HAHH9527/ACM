package leetcode

object Cn1995 {

    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        val array = intArrayOf(1, 1, 1, 3, 5)
//        println(array.drop(2).joinToString())
        println(s.countQuadruplets(array))
        println(s.countQuadruplets(intArrayOf(1, 1, 1, 3, 3, 3)))

    }

    class Solution {
        fun countQuadruplets(nums: IntArray): Int {
            var count = 0
            for (i in 0 until nums.size - 3) {
                for (j in i + 1 until nums.size - 2) {
                    for (k in j + 1 until nums.size - 1) {
                        val sum = nums[i] + nums[j] + nums[k]
                        for (l in k + 1 until nums.size) {
                            if (nums[l] == sum) count++
                        }
                    }
                }
            }
            return count
        }
    }
}