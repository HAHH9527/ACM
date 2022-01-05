package leetcode

object Cn1576 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = Solution()
        println(s.modifyString("??yw?ipkj?"))
    }

    class Solution {
        fun modifyString(s: String): String {

            if (s.length <= 1) {
                return if (s != "?") s else "a"
            }

            val charArray = s.toCharArray()
            charArray.forEachIndexed { index, c ->
                if (c == '?') {
                    val pre: Char
                    val next: Char
                    when (index) {
                        0 -> {
                            next = charArray[index + 1]
                            pre = next
                        }
                        charArray.size - 1 -> {
                            pre = charArray[index - 1]
                            next = pre
                        }
                        else -> {
                            pre = charArray[index - 1]
                            next = charArray[index + 1]
                        }
                    }
                    var the: Char = pre + 1
                    if (the > 'z' || the < 'a') the = 'a'
                    while (the == pre || the == next) {
                        the++
                        if (the > 'z') the = 'a'
                    }
                    charArray[index] = the
                }
            }

            return String(charArray)
        }
    }
}