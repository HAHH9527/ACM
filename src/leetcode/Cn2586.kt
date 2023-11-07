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

        fun vowelStrings2(words: Array<String>, left: Int, right: Int): Int {
            var count = 0
            for (i in left..right) {
                if (words[i].first().isVowel() && words[i].last().isVowel()) count++
            }
            return count
        }

        fun Char.isVowel(): Boolean {
            return this == 'a' || this == 'e' || this == 'i' || this == 'o' || this == 'u'
        }
    }
}