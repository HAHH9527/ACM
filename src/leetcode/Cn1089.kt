package leetcode

object Cn1089 {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0, 0, 4, 5, 0)
        duplicateZeros(arr)
        println(arr.joinToString())
    }

    fun duplicateZeros(arr: IntArray) {
        val size = arr.size

        var i = 0
        var count = 0
        while (i < size) {
            count++
            if (arr[i] == 0) count++ // count of 0
            if (count >= size) break
            i++
        }

        var j: Int = size - 1
        while (j >= 0) {
            when {
                arr[i] != 0 -> {
                    arr[j] = arr[i]
                }
                arr[i] == 0 && count > size && j == size - 1 -> { //前面扫描时，最后一个是0，因为新增0会挤掉，所以只需要1个
                    arr[j] = arr[i] //这里arr[i] == 0
                }
                else -> {
                    arr[j] = arr[i] //非最后一个，arr[i] == 0，但占据2个位置
                    arr[j - 1] = arr[i]
                    j--
                }
            }
            i--
            j--
        }
    }
}