package leetcode

object Cn917 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        println(s.reverseOnlyLetters("ab-cd"))
        println(s.reverseOnlyLetters("a-bC-dEf-ghIj"))
        println(s.reverseOnlyLetters("Test1ng-Leet=code-Q!"))
    }

    class Solution {
        private fun Char.isLetter(): Boolean {
            if (this in 'a'..'z') return true
            if (this in 'A'..'Z') return true
            return false
        }

        fun reverseOnlyLetters(s: String): String {
            val array = s.toCharArray()
            var header = 0
            var footer = array.lastIndex
            while (header < footer) {
                if (!array[header].isLetter()) header++
                else if (!array[footer].isLetter()) footer--
                else {
                    val temp = array[header]
                    array[header] = array[footer]
                    array[footer] = temp
                    header++
                    footer--
                }
            }
            return array.joinToString(separator = "")
        }
    }
}