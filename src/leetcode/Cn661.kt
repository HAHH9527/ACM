package leetcode

object Cn661 {

    class Solution {
        fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
            val width = img.size
            val height = img[0].size
            val ans = Array(width) { IntArray(height) }

            ans.forEachIndexed { oX, ints ->
                ints.forEachIndexed { oY, _ ->
                    var count = 0
                    var sum = 0
                    for (x in oX - 1..oX + 1) {
                        for (y in oY - 1..oY + 1) {
                            if (x in 0 until width && y in 0 until height) {
                                sum += img[x][y]
                                count++
                            }
                        }
                    }
                    ans[oX][oY] = sum / count
                }
            }
            return ans
        }
    }
}