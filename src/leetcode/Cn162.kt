package leetcode

object Cn162 {
    class Solution {
        fun findPeakElement(nums: IntArray): Int {
            var l = 0
            var r = nums.lastIndex
            while (l < r) {
                val m = (l + r) / 2
                if (nums[m] > nums[m + 1]) r = m
                else l = m + 1
            }
            return l
        }
    }
}