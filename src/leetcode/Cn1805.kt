package leetcode

object Cn1805 {

    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        println(s.numDifferentIntegers("a123bc34d8ef34"))
        println(s.numDifferentIntegers("leet1234code234"))
    }

    class Solution {
        fun numDifferentIntegers(word: String): Int {
            val chars = word.toCharArray().map { c ->
                if (c < '0' || c > '9') ' '
                else c
            }
            val outString = chars.joinToString(separator = "")
            val intArray = outString.split(' ').filter { it != "" }.map {
                it.trimStart('0')
            }
            val intSet = mutableSetOf<String>()
            intSet.addAll(intArray)
            return intSet.size
        }
    }
}
