package leetcode

import java.util.*
import kotlin.math.max
import kotlin.math.min

object Cn1705 {

    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution().eatenApples(intArrayOf(2, 1, 10), intArrayOf(2, 10, 1))
        println(solution)
    }

    class Solution {
        fun eatenApples(apples: IntArray, days: IntArray): Int {
            if (apples.size == 1) return min(days[0], apples[0])
            var endDay = 0 // 结束在哪天
            var zeroDay = 0 // 空闲的天数
            for (i in apples.indices) {
                if (apples[i] != 0 && i + days[i] > endDay) endDay = i + days[i]
                if (i >= endDay) zeroDay++
            }
            return endDay - zeroDay
        }

        fun eatenApples2(apples: IntArray, days: IntArray): Int {
            var day = 0
            //找出苹果还未全部腐烂的最后日期
            for (i in days.indices) {
                day = max(i + days[i], day)
            }
            //下标值表示失效日期，存储在当天后即腐烂的苹果数
            val tmp = IntArray(day)
            var curMax = day
            var res = 0
            for (i in 0 until day) {
                //保存当天新长出的苹果
                if (i < apples.size && apples[i] != 0) {
                    tmp[i + days[i] - 1] += apples[i]
                    curMax = min(curMax, i + days[i] - 1)
                }
                //有苹果就拿出来吃掉
                var idx = max(i, curMax)
                while (idx < day && tmp[idx] == 0) {
                    idx++
                }
                if (idx != day) {
                    tmp[idx]--
                    res++
                }
            }
            return res
        }

        fun eatenApples3(apples: IntArray, days: IntArray): Int {
            val queue: Queue<IntArray> = PriorityQueue { a, b -> a[1] + a[2] - (b[1] + b[2]) }
            var max = 0
            for (i in 0 until apples.size + 20000) {
                //放入当天的苹果
                if (i < apples.size && apples[i] > 0 && days[i] > 0) queue.add(intArrayOf(apples[i], i, days[i]))
                //吃最早过期的苹果
                if (!queue.isEmpty()) {
                    val cur = queue.poll()
                    if (cur[0]-- > 0 && i < cur[1] + cur[2]) {
                        if (cur[0] > 0) queue.offer(cur)
                        max++
                    }
                }
                //取出今天过期的苹果
                while (!queue.isEmpty() && i + 1 == queue.peek()[1] + queue.peek()[2]) queue.poll()
            }
            return max
        }
    }
}