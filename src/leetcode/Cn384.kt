package leetcode

import kotlin.random.Random

object Cn384 {
    @JvmStatic
    fun main(args: Array<String>) {
        val obj = Solution(intArrayOf(1,2,3))
        var param_1 = obj.reset()
        var param_2 = obj.shuffle()
    }

    class Solution(nums: IntArray) {

        private val origin = nums
        private var array = origin.clone()

        fun reset(): IntArray {
            array = origin.clone()
            return array
        }

        fun shuffle(): IntArray {
            shuffle(array, Random)
            return array
        }

        /**
         * 洗牌算法
         * 从最后一张开始
         * 第n张牌随机与n~0张牌交换
         */
        private fun shuffle(array: IntArray, random: Random) {
            for (i in array.lastIndex downTo 1) {
                val j = random.nextInt(i + 1)
                val copy = array[i]
                array[i] = array[j]
                array[j] = copy
            }
        }

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */