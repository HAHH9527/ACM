package leetcode

object Cn2586 {
    class Solution {
        fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
            var count = 0
            for (i in left..right) {
                if (words[i].matches(Regex("^[aeiou]$")) ||
                    words[i].matches(Regex("^[aeiou].*[aeiou]\$"))
                ) {
                    count++
                }
            }
            return count
        }
    }
}