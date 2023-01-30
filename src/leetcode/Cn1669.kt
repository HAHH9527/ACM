package leetcode

object Cn1669 {

    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    class Solution {
        fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
            var inputNode: ListNode? = null
            var outputNode: ListNode? = null
            var nowNode: ListNode? = list1
            var i = 0
            while (i <= b) {
                if (inputNode == null && i == a - 1) inputNode = nowNode
                if (outputNode == null && i == b) outputNode = nowNode?.next
                i++
                nowNode = nowNode?.next
            }
            inputNode?.next = list2
            var list2End: ListNode? = list2
            while (list2End?.next != null) {
                list2End = list2End.next
            }
            list2End?.next = outputNode
            return list1
        }
    }
}