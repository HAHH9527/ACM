package leetcode

object Cn2108 {

    class Solution {
        fun firstPalindrome(words: Array<String>): String {
            words.forEach { str ->
                if (str == str.reversed()) return str
            }
            return ""
        }
    }
}